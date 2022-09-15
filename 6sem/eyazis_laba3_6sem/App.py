import Vocabulary
import Controller
import View


class App:
    def __init__(self):
        voc = Vocabulary.Vocabulary()
        view = View.View()
        controller = Controller.Controller(voc, view)
        view.set_controller(controller)
        self.__voc = voc
        self.__view = view
        self.__controller = controller

    def __del__(self):
        del self.__controller
        del self.__view
        del self.__voc

    def start(self):
        self.__view.mainloop()


if __name__ == "__main__":
    # import nltk
    #
    # nltk.download('punkt')
    # nltk.download('averaged_perceptron_tagger')
    # nltk.download('wordnet')
    # nltk.download('omw-1.4')
    app = App()
    app.start()
