package com.azefsw.audioconnect.player.audio.output.audiotrack;

import defpackage.fc2;

/* JADX INFO: loaded from: classes.dex */
public final class AudioTrackWriteException extends RuntimeException {
    public final int w;
    public final String x;

    public AudioTrackWriteException(int i, String str) {
        super(fc2.a("Writing to AudioTrack failed (", str, ")"));
        this.w = i;
        this.x = str;
    }
}
