package com.google.android.gms.internal.ads;

import defpackage.o96;
import defpackage.p96;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzckk {
    public long a;

    public final long zza(ByteBuffer byteBuffer) {
        zzalq zzalqVar;
        zzalp zzalpVar;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzall(new o96(byteBufferDuplicate), p96.c).zze().iterator();
            while (true) {
                zzalqVar = null;
                if (!it.hasNext()) {
                    zzalpVar = null;
                    break;
                }
                zzaln zzalnVar = (zzaln) it.next();
                if (zzalnVar instanceof zzalp) {
                    zzalpVar = (zzalp) zzalnVar;
                    break;
                }
            }
            for (zzaln zzalnVar2 : zzalpVar.zze()) {
                if (zzalnVar2 instanceof zzalq) {
                    zzalqVar = (zzalq) zzalnVar2;
                    break;
                }
            }
            long jZzd = (zzalqVar.zzd() * 1000) / zzalqVar.zze();
            this.a = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
