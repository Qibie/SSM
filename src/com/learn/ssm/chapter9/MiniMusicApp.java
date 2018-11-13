package com.learn.ssm.chapter9;

import javax.sound.midi.*;

public class MiniMusicApp {
    public static void main(String[] args) {
        MiniMusicApp miniMusicApp = new MiniMusicApp();
        miniMusicApp.play();
    }

    private void play() {
        try {
            // 取得Sequencer并打开
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq =  new Sequence(Sequence.PPQ, 4);

            // 获得Track
            Track track = seq.createTrack();

            // 对Track加入两个MidiEvent
            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b,  16);
            track.add(noteOff);

            // 将Sequence送到Sequencer上
            player.setSequence(seq);
            // 开始播放
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
