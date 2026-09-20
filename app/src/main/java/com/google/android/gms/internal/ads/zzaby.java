package com.google.android.gms.internal.ads;

import defpackage.at5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaby implements zzzi {
    public final long w;
    public final zzzi x;

    public zzaby(long j, zzzi zzziVar) {
        this.w = j;
        this.x = zzziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzB() {
        this.x.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzL(zzaai zzaaiVar) {
        this.x.zzL(new at5(this, zzaaiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final zzaam zzv(int i, int i2) {
        return this.x.zzv(i, i2);
    }
}
