
package interfaceexample;

class Phone
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void videoCall() {System.out.println("Smart Phone video call"); }
    public void click() { System.out.println("Smart Phone clicking photo"); }
    public void record() { System.out.println("Smart Phone recording videos"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void pause() { System.out.println("Smart Phone pausing music"); }
    public void stop() { System.out.println("Smart Phone stopping music"); }
}

public class InterfaceExample {

    public static void main(String[] args) {
        Phone p = new Phone();
        ICamera c = new SmartPhone();
        IMusicPlayer m = new SmartPhone();
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.sms();
        sp.click();
        sp.play();
        sp.videoCall();
        p.call();
        m.pause();
        c.record();
    }
    
}
