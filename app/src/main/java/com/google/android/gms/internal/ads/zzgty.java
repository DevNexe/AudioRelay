package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgty implements zzaln {
    public static final zzguj E = zzguj.zzb(zzgty.class);
    public ByteBuffer A;
    public long B;
    public zzgud D;
    public final String w;
    public zzalo x;
    public long C = -1;
    public boolean z = true;
    public boolean y = true;

    public zzgty(String str) {
        this.w = str;
    }

    public final synchronized void a() {
        if (this.z) {
            return;
        }
        try {
            zzguj zzgujVar = E;
            String str = this.w;
            zzgujVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.A = this.D.zzd(this.B, this.C);
            this.z = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaln
    public final String zza() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzaln
    public final void zzb(zzgud zzgudVar, ByteBuffer byteBuffer, long j, zzalk zzalkVar) {
        this.B = zzgudVar.zzb();
        byteBuffer.remaining();
        this.C = j;
        this.D = zzgudVar;
        zzgudVar.zze(zzgudVar.zzb() + j);
        this.z = false;
        this.y = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaln
    public final void zzc(zzalo zzaloVar) {
        this.x = zzaloVar;
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        a();
        zzguj zzgujVar = E;
        String str = this.w;
        zzgujVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.A;
        if (byteBuffer != null) {
            this.y = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.A = null;
        }
    }
}
