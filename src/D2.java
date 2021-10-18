/*


Student(name, age, class)
---------------------------------
 SmartPhone (Camera, Display, CPU)
 Camera(sensor_size, megapixel, type)
 Display(resolution, type, size)
 CPU(size, frequency) 
 
 */


class Camera{
    int sensor_size;
    int megapixel;
    String type;

    public Camera(){

    }
    public Camera(int sensor_size, int megapixel, String type) {
        this.sensor_size = sensor_size;
        this.megapixel = megapixel;
        this.type = type;
    }

    public int getSensor_size() {
        return sensor_size;
    }

    public void setSensor_size(int sensor_size) {
        this.sensor_size = sensor_size;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "sensor_size=" + sensor_size +
                ", megapixel=" + megapixel +
                ", type='" + type + '\'' +
                '}';
    }
}

class Display{
    String resolution;
    String type;
    double size;

    public Display(){

    }

    public Display(String resolution, String type, double size) {
        this.resolution = resolution;
        this.type = type;
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Display{" +
                "resolution='" + resolution + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}

class CPU{
    int size;
    double frequency;

    public CPU(){

    }

    public CPU(int size, double frequency) {
        this.size = size;
        this.frequency = frequency;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "size=" + size +
                ", frequency=" + frequency +
                '}';
    }
}

class SmartPhone{
    Camera camera;
    Display display;
    CPU cpu;

    public SmartPhone(){

    }

    public SmartPhone(Camera camera, Display display, CPU cpu) {
        this.camera = camera;
        this.display = display;
        this.cpu = cpu;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camera=" + camera +
                ", display=" + display +
                ", cpu=" + cpu +
                '}';
    }
}

/*
 SmartPhone (Camera, Display, CPU)
 Camera(sensor_size, megapixel, type)
 Display(resolution, type, size)
 CPU(size, frequency)

 */

public class D2 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone);
        // First smartphone type 1
//        SmartPhone smartPhone1 = new SmartPhone(
//                new Camera(2, 64, "macro"),
//                new Display("1920*1080", "SAMOLED", 6),
//                new CPU(7, 2.8)
//        );

        // First smartphone type 2
        Camera camera =  new Camera(2, 64, "macro");
        Display display =  new Display("1920*1080", "SAMOLED", 6);
        CPU cpu = new CPU(7, 2.8);
        SmartPhone iphone12 = new SmartPhone(camera, display, cpu);
        System.out.println(iphone12);

        SmartPhone iPhone13 = iphone12;
        iPhone13.camera.setMegapixel(108);
        System.out.println(iPhone13);

        SmartPhone iPhone13Mini = iPhone13;
        iPhone13Mini.display.setSize(5);
        System.out.println(iPhone13Mini);

        int _foo = 120;
        System.out.println(_foo);
    }
}

/*

Naming convention:
Class : First Letter Caps, SmartPhone
Object :  smartPhone
Variables :first first_person
Constants : CAPS
Functions : toString(), nextInt(), next(), chatAt(), parseInt()

 */
