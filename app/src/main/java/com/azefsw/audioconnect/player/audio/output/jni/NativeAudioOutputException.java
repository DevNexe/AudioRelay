package com.azefsw.audioconnect.player.audio.output.jni;

import defpackage.fc2;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAudioOutputException extends RuntimeException {
    public final String w;

    public NativeAudioOutputException(String str) {
        super(fc2.a("Using OpenSL failed (", str, ")"));
        this.w = str;
    }
}
