package com.azefsw.audioconnect.player.decoders;

/* JADX INFO: loaded from: classes.dex */
public final class OpusAudioDecoderException extends RuntimeException {
    public final String w;

    public OpusAudioDecoderException(String str) {
        this.w = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.w;
    }
}
