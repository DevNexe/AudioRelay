package com.azefsw.audioconnect.nativelibrary.audio.noise;

/* JADX INFO: loaded from: classes.dex */
public final class NoiseStartResult {
    private final long noisePointer;
    private final int numberOfSamplesInASingleFrame;

    public NoiseStartResult(long j, int i) {
        this.noisePointer = j;
        this.numberOfSamplesInASingleFrame = i;
    }

    public final long getNoisePointer() {
        return this.noisePointer;
    }

    public final int getNumberOfSamplesInASingleFrame() {
        return this.numberOfSamplesInASingleFrame;
    }
}
