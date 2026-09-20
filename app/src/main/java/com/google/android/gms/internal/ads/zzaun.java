package com.google.android.gms.internal.ads;

import defpackage.bj0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaun extends zzaui {
    public final zzaul zza = new zzaul();
    public ByteBuffer zzb;
    public long zzc;

    public zzaun(int i) {
    }

    public final void a(int i) {
        ByteBuffer byteBuffer = this.zzb;
        throw new IllegalStateException(bj0.a("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void zzh(int i) {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            a(i);
            throw null;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.zzb.position() + i;
        if (iCapacity >= iPosition) {
            return;
        }
        a(iPosition);
        throw null;
    }

    public final boolean zzi() {
        return (this.a & 1073741824) == 1073741824;
    }
}
