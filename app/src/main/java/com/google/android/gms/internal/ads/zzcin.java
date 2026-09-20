package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcin {
    public static final AtomicInteger w = new AtomicInteger(0);
    public static final AtomicInteger x = new AtomicInteger(0);

    public static int zzs() {
        return w.get();
    }

    public static int zzu() {
        return x.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract void zzC(Uri[] uriArr, String str);

    public abstract void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    public abstract void zzE();

    public abstract void zzF(long j);

    public abstract void zzG(int i);

    public abstract void zzH(int i);

    public abstract void zzI(zzcim zzcimVar);

    public abstract void zzJ(int i);

    public abstract void zzK(int i);

    public abstract void zzL(boolean z);

    public abstract void zzM(boolean z);

    public abstract void zzN(int i);

    public abstract void zzO(Surface surface, boolean z);

    public abstract void zzP(float f, boolean z);

    public abstract void zzQ();

    public abstract boolean zzR();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}
