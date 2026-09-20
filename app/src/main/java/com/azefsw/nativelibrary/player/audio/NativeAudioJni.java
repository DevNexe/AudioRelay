package com.azefsw.nativelibrary.player.audio;

import defpackage.kv2;

/* JADX INFO: loaded from: classes.dex */
public class NativeAudioJni {
    public long a = -1;

    private native void collectStats(long j, NativeAudioStats nativeAudioStats);

    private native long createManager();

    private native void destroy(long j);

    private native void enqueueBytes(long j, byte[] bArr, int i, int i2);

    private native String[] getLastError(long j);

    private native String[] initialize(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private native void mute(long j);

    private native void setVolume(long j, float f);

    private native String[] start(long j, int i);

    private native void stop(long j);

    public final void a(NativeAudioStats nativeAudioStats) {
        collectStats(this.a, nativeAudioStats);
    }

    public final void b() {
        destroy(this.a);
    }

    public final void c(byte[] bArr, int i, int i2) {
        enqueueBytes(this.a, bArr, i, i2);
    }

    public final String[] d() {
        return getLastError(this.a);
    }

    public final String[] e(int i, int i2, int i3, int i4, int i5, int i6, kv2 kv2Var) {
        long jCreateManager = createManager();
        this.a = jCreateManager;
        return initialize(jCreateManager, i, i2, i3, i4, i5, i6, kv2Var.w);
    }

    public final void f() {
        mute(this.a);
    }

    public final void g(float f) {
        setVolume(this.a, f);
    }

    public final String[] h(int i) {
        return start(this.a, i);
    }

    public final void i() {
        stop(this.a);
    }
}
