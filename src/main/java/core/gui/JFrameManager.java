package core.gui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class JFrameManager {

    private Stack<JFrame> frames = new Stack<JFrame>();
    private List<JFrame> frameList = new ArrayList<JFrame>();
    private static JFrameManager frameManager;

    public static JFrameManager getInstance(){
        if(frameManager == null){
            frameManager = new JFrameManager();
        }
        return frameManager;
    }

    public void pushFrame(JFrame frame){
        frames.push(frame);
    }

    public JFrame getLastFrame(){
        return frames.pop();
    }

    public void addFrame(JFrame frame){
        frameList.add(frame);
    }

    public JFrame createFrame(String name){
        for(JFrame frame : frameList){
            if(frame.getName().equals(name)){
                return frame;
            }
        }
        JFrame frame = new JFrame(name);
        frameList.add(frame);
        return frame;
    }

    public JFrame getFrame(String name){
        for(JFrame frame : frameList){
            if(frame.getName().equals(name)){
                return frame;
            }
        }
        return null;
    }
}
