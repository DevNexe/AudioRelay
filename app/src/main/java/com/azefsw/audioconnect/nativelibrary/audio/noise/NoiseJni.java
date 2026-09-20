package com.azefsw.audioconnect.nativelibrary.audio.noise;

import defpackage.a62;
import defpackage.ny1;
import defpackage.sd5;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class NoiseJni {
    public volatile long a = -1;
    public final ny1 b = new ny1(5);

    private final native NoiseStartResult createManager();

    private final native void destroy(long j);

    private final native void disableVoiceDetectionCutoff(long j);

    private final native void enableVoiceDetectionCutoff(long j, long j2, float f, float f2);

    private final native byte[] processFrame(long j, byte[] bArr, int i, int i2);

    public final void a() {
        this.b.k();
        destroy(this.a);
    }

    public final void b() {
        ny1 ny1Var = this.b;
        try {
            if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                disableVoiceDetectionCutoff(this.a);
                sd5 sd5Var = sd5.a;
            } else {
                sd5 sd5Var2 = sd5.a;
            }
        } finally {
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
        }
    }

    public final void c(float f, float f2, long j) {
        ny1 ny1Var = this.b;
        try {
            if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                enableVoiceDetectionCutoff(this.a, j, f, f2);
                sd5 sd5Var = sd5.a;
            } else {
                sd5 sd5Var2 = sd5.a;
            }
        } finally {
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
        }
    }

    public final int d() {
        System.loadLibrary("noise");
        System.loadLibrary("noise-jni");
        NoiseStartResult noiseStartResultCreateManager = createManager();
        this.a = noiseStartResultCreateManager.getNoisePointer();
        return noiseStartResultCreateManager.getNumberOfSamplesInASingleFrame();
    }

    public final byte[] e(byte[] bArr, int i, int i2) {
        byte[] bArrProcessFrame;
        ny1 ny1Var = this.b;
        try {
            if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                bArrProcessFrame = processFrame(this.a, bArr, i, i2);
            } else {
                a62 a62Var = a62.a;
                bArrProcessFrame = new byte[0];
            }
            return bArrProcessFrame;
        } finally {
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
        }
    }
}
