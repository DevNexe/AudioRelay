package com.azefsw.audioconnect.opus.jni;

/* JADX INFO: loaded from: classes.dex */
public class OpusJni {
    public native int decode(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    public native void destroyDecoder(long j);

    public native void destroyEncoder(long j);

    public native int encode(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    public native String[] setEncoderBitrate(long j, int i);

    public native OpusStartResult startDecoder(int i, int i2, int i3);

    public native OpusStartResult startEncoder(int i, int i2, int i3, int i4);
}
