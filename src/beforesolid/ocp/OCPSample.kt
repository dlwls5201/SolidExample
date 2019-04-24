package beforesolid.ocp

/**
 *  OCP 원칙이 깨질 때의 주요 현상
 *
 *  1. 다운 캐스팅을 한다.
 *  2. 비슷한 if-else 블록이 존재한다.
 */
class OCPSample {

    open class Animal {

        fun sound() {
            println("sound")
        }
    }

    class Lion: Animal() {

        fun soundLion() {
            println("sound lion")
        }
    }

    //다운 캐스팅을 한다.
    fun drawCharacter(animal: Animal) {
        if(animal is Lion) {
            // 다운 캐스팅은 OCP 위반
            animal.soundLion()
        } else {
            animal.sound()
        }
    }

    //비슷한 if-else 블록이 존재한다.
    class Enemy(val type: Int): Animal() {

        fun sounType() {

            // 반복적인 if-else 블록 OCP 위반
            if(type == 1) {
                //...
            } else if(type == 2) {
                //...
            } else if(type == 3) {
                //...
            } else {
                //...
            }
        }
    }
}

