import Logic

class Main {
    companion object : SuitCallback {
        @JvmStatic
        fun main(args: Array<String>) {
            do {
                val mainMenu = Logic()
                mainMenu.startGame(this)
                println("\n")
                println("Try Again? Y/N")
                val lanjutMain = readLine()!!.toUpperCase()
            }while (lanjutMain == "Y")

        }

        override fun sendValue(hasil: String) {
            print(hasil)
        }
    }
}