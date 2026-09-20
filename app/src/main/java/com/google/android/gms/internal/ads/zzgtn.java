package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;
import defpackage.wv6;
import defpackage.zv6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtn extends zzgon implements zzgpy {
    private static final zzgtn zzb;
    private zzgtm zzA;
    private zzgow zzB;
    private zzgso zzC;
    private String zzD;
    private zzgsg zzE;
    private int zze;
    private int zzf;
    private int zzg;
    private zzgsk zzk;
    private zzgow zzl;
    private zzgow zzm;
    private String zzn;
    private zzgtb zzo;
    private boolean zzp;
    private zzgow zzq;
    private String zzr;
    private boolean zzs;
    private boolean zzt;
    private zzgnf zzu;
    private zzgtj zzv;
    private boolean zzw;
    private String zzx;
    private zzgow zzy;
    private zzgow zzz;
    private byte zzF = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzgtn zzgtnVar = new zzgtn();
        zzb = zzgtnVar;
        zzgon.i(zzgtn.class, zzgtnVar);
    }

    public zzgtn() {
        qu6 qu6Var = qu6.z;
        this.zzl = qu6Var;
        this.zzm = qu6Var;
        this.zzn = "";
        this.zzq = qu6Var;
        this.zzr = "";
        this.zzu = zzgnf.zzb;
        this.zzx = "";
        this.zzy = qu6Var;
        this.zzz = qu6Var;
        this.zzB = qu6Var;
        this.zzD = "";
    }

    public static /* synthetic */ void n(zzgtn zzgtnVar, String str) {
        str.getClass();
        zzgtnVar.zze |= 4;
        zzgtnVar.zzh = str;
    }

    public static /* synthetic */ void o(zzgtn zzgtnVar, String str) {
        str.getClass();
        zzgtnVar.zze |= 8;
        zzgtnVar.zzi = str;
    }

    public static /* synthetic */ void p(zzgtn zzgtnVar, zzgsk zzgskVar) {
        zzgskVar.getClass();
        zzgtnVar.zzk = zzgskVar;
        zzgtnVar.zze |= 32;
    }

    public static /* synthetic */ void q(zzgtn zzgtnVar, zzgth zzgthVar) {
        zzgthVar.getClass();
        zzgow zzgowVar = zzgtnVar.zzl;
        if (!zzgowVar.zzc()) {
            zzgtnVar.zzl = zzgon.g(zzgowVar);
        }
        zzgtnVar.zzl.add(zzgthVar);
    }

    public static /* synthetic */ void r(zzgtn zzgtnVar, String str) {
        zzgtnVar.zze |= 64;
        zzgtnVar.zzn = str;
    }

    public static /* synthetic */ void s(zzgtn zzgtnVar) {
        zzgtnVar.zze &= -65;
        zzgtnVar.zzn = zzb.zzn;
    }

    public static /* synthetic */ void t(zzgtn zzgtnVar, zzgtb zzgtbVar) {
        zzgtbVar.getClass();
        zzgtnVar.zzo = zzgtbVar;
        zzgtnVar.zze |= 128;
    }

    public static /* synthetic */ void u(zzgtn zzgtnVar, zzgtj zzgtjVar) {
        zzgtjVar.getClass();
        zzgtnVar.zzv = zzgtjVar;
        zzgtnVar.zze |= 8192;
    }

    public static /* synthetic */ void v(zzgtn zzgtnVar, Iterable iterable) {
        zzgow zzgowVar = zzgtnVar.zzy;
        if (!zzgowVar.zzc()) {
            zzgtnVar.zzy = zzgon.g(zzgowVar);
        }
        zzgmo.b(iterable, zzgtnVar.zzy);
    }

    public static /* synthetic */ void w(zzgtn zzgtnVar, Iterable iterable) {
        zzgow zzgowVar = zzgtnVar.zzz;
        if (!zzgowVar.zzc()) {
            zzgtnVar.zzz = zzgon.g(zzgowVar);
        }
        zzgmo.b(iterable, zzgtnVar.zzz);
    }

    public static /* synthetic */ void x(zzgtn zzgtnVar, int i) {
        zzgtnVar.zzf = i - 1;
        zzgtnVar.zze |= 1;
    }

    public static zzgsi zza() {
        return (zzgsi) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzF);
        }
        byte b = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0006\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", zzgth.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzf", zv6.a, "zzg", wv6.a, "zzk", "zzn", "zzo", "zzu", "zzm", zzgtr.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzgtx.class, "zzC", "zzD", "zzE"});
        }
        if (i2 == 3) {
            return new zzgtn();
        }
        if (i2 == 4) {
            return new zzgsi(b);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzF = zzgonVar != null ? (byte) 1 : (byte) 0;
        return null;
    }

    public final String zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzl;
    }
}
