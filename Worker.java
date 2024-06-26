public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String error);
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Ошибка в задаче: " + i);
            } else {
                callback.onDone("Задача " + i + " выполнена");
            }
        }
    }


}
