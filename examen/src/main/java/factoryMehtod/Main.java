package factoryMehtod;

public class Main {

    public static void main(String[] args)
    {
        CreateAbstract creator = new Creator();

        IFile audio = creator.create( Creator.AUDIO );
        audio.play();

        IFile video = creator.create( Creator.VIDEO );
        video.play();
    }
}
