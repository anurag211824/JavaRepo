package JavaCodes.Multithreading.C_Different_Cases_Of_Executing_Threads;

public class D_Multiple_Task_Multiple_Thread {
    public static void main(String[] args) {
        PlayVideo v1 = new PlayVideo();
        PlayMusic v2 = new PlayMusic();
        GiveSubtitle v3 = new GiveSubtitle();
        ShowingTimer v4 = new ShowingTimer();

        Thread t1 = new Thread(v1);
        Thread t2 = new Thread(v2);
        Thread t3 = new Thread(v3);
        Thread t4 = new Thread(v4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class VLC_Media_player {
    public int time = 60;
}

class PlayVideo extends VLC_Media_player implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= time; i++) {
            System.out.println("Playing Video:" + i + " sec");
        }
    }

}

class PlayMusic extends VLC_Media_player implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= time; i++) {
            System.out.println("Playing Music:" + i + " sec");
        }
    }

}

class GiveSubtitle extends VLC_Media_player implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= time; i++) {
            System.out.println("Playing Subtitles:" + i + " sec");
        }
    }

}

class ShowingTimer extends VLC_Media_player implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= time; i++) {
            System.out.println("Showing Time:" + i + " sec");
        }
    }

}