package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class zzgtz extends zzguc implements zzaln {
    public zzalo D;
    public final String E = "moov";

    public zzgtz(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaln
    public final String zza() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.zzaln
    public final void zzb(zzgud zzgudVar, ByteBuffer byteBuffer, long j, zzalk zzalkVar) {
        zzgudVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.x = zzgudVar;
        this.z = zzgudVar.zzb();
        zzgudVar.zze(zzgudVar.zzb() + j);
        this.A = zzgudVar.zzb();
        this.w = zzalkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaln
    public final void zzc(zzalo zzaloVar) {
        this.D = zzaloVar;
    }
}
