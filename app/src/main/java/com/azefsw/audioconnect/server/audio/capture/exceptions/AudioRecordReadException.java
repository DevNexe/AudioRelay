package com.azefsw.audioconnect.server.audio.capture.exceptions;

/* JADX INFO: loaded from: classes.dex */
public final class AudioRecordReadException extends AudioRecordException {
    public final int w;
    public final String x;

    public AudioRecordReadException(int i, String str) {
        super(0);
        this.w = i;
        this.x = str;
    }
}
