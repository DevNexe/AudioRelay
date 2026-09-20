package com.google.android.gms.internal.ads;

import defpackage.ey5;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzalj implements zzalk {
    public static final Logger b = Logger.getLogger(zzalj.class.getName());
    public final ey5 a = new ey5();

    public abstract zzaln zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzalk
    public final zzaln zzb(zzgud zzgudVar, zzalo zzaloVar) throws EOFException {
        int iZza;
        long jZzc;
        long jZzb = zzgudVar.zzb();
        ey5 ey5Var = this.a;
        ((ByteBuffer) ey5Var.get()).rewind().limit(8);
        do {
            iZza = zzgudVar.zza((ByteBuffer) ey5Var.get());
            if (iZza == 8) {
                ((ByteBuffer) ey5Var.get()).rewind();
                long jZze = zzalm.zze((ByteBuffer) ey5Var.get());
                byte[] bArr = null;
                if (jZze < 8 && jZze > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZze);
                    sb.append("). Stop parsing!");
                    b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) ey5Var.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jZze == 1) {
                        ((ByteBuffer) ey5Var.get()).limit(16);
                        zzgudVar.zza((ByteBuffer) ey5Var.get());
                        ((ByteBuffer) ey5Var.get()).position(8);
                        jZzc = zzalm.zzf((ByteBuffer) ey5Var.get()) - 16;
                    } else {
                        jZzc = jZze == 0 ? zzgudVar.zzc() - zzgudVar.zzb() : jZze - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) ey5Var.get()).limit(((ByteBuffer) ey5Var.get()).limit() + 16);
                        zzgudVar.zza((ByteBuffer) ey5Var.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) ey5Var.get()).position() - 16; iPosition < ((ByteBuffer) ey5Var.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) ey5Var.get()).position() - 16)] = ((ByteBuffer) ey5Var.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j = jZzc;
                    zzaln zzalnVarZza = zza(str, bArr, zzaloVar instanceof zzaln ? ((zzaln) zzaloVar).zza() : "");
                    zzalnVarZza.zzc(zzaloVar);
                    ((ByteBuffer) ey5Var.get()).rewind();
                    zzalnVarZza.zzb(zzgudVar, (ByteBuffer) ey5Var.get(), j, this);
                    return zzalnVarZza;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iZza >= 0);
        zzgudVar.zze(jZzb);
        throw new EOFException();
    }
}
