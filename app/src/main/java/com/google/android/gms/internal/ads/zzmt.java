package com.google.android.gms.internal.ads;

import android.util.Base64;
import defpackage.r47;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmt implements zzmx {
    public final zzcm a;
    public final zzck b;
    public final HashMap c;
    public final zzfsv d;
    public zzmw e;
    public zzcn f;
    public String g;
    public static final zzfsv zza = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzmr
        @Override // com.google.android.gms.internal.ads.zzfsv
        public final Object zza() {
            return zzmt.zzc();
        }
    };
    public static final Random h = new Random();

    public zzmt() {
        throw null;
    }

    public static String zzc() {
        byte[] bArr = new byte[12];
        h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    public final r47 a(int i, zzsg zzsgVar) {
        HashMap map = this.c;
        r47 r47Var = null;
        long j = Long.MAX_VALUE;
        for (r47 r47Var2 : map.values()) {
            if (r47Var2.c == -1 && i == r47Var2.b && zzsgVar != null) {
                r47Var2.c = zzsgVar.zzd;
            }
            zzsg zzsgVar2 = r47Var2.d;
            if (zzsgVar != null ? !(zzsgVar2 != null ? !(zzsgVar.zzd == zzsgVar2.zzd && zzsgVar.zzb == zzsgVar2.zzb && zzsgVar.zzc == zzsgVar2.zzc) : zzsgVar.zzb() || zzsgVar.zzd != r47Var2.c) : i == r47Var2.b) {
                long j2 = r47Var2.c;
                if (j2 == -1 || j2 < j) {
                    r47Var = r47Var2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzel.zza;
                    if (r47Var.d != null && zzsgVar2 != null) {
                        r47Var = r47Var2;
                    }
                }
            }
        }
        if (r47Var != null) {
            return r47Var;
        }
        byte[] bArr = new byte[12];
        h.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        r47 r47Var3 = new r47(this, strEncodeToString, i, zzsgVar);
        map.put(strEncodeToString, r47Var3);
        return r47Var3;
    }

    @RequiresNonNull({"listener"})
    public final void b(zzkn zzknVar) {
        zzsg zzsgVar;
        if (zzknVar.zzb.zzo()) {
            this.g = null;
            return;
        }
        r47 r47Var = (r47) this.c.get(this.g);
        this.g = a(zzknVar.zzc, zzknVar.zzd).a;
        zzh(zzknVar);
        zzsg zzsgVar2 = zzknVar.zzd;
        if (zzsgVar2 == null || !zzsgVar2.zzb()) {
            return;
        }
        if (r47Var != null) {
            long j = r47Var.c;
            zzsg zzsgVar3 = zzknVar.zzd;
            if (j == zzsgVar3.zzd && (zzsgVar = r47Var.d) != null && zzsgVar.zzb == zzsgVar3.zzb && zzsgVar.zzc == zzsgVar3.zzc) {
                return;
            }
        }
        zzsg zzsgVar4 = zzknVar.zzd;
        a(zzknVar.zzc, new zzsg(zzsgVar4.zza, zzsgVar4.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final synchronized String zzd() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final synchronized String zze(zzcn zzcnVar, zzsg zzsgVar) {
        return a(zzcnVar.zzn(zzsgVar.zza, this.b).zzd, zzsgVar).a;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final synchronized void zzf(zzkn zzknVar) {
        zzmw zzmwVar;
        this.g = null;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            r47 r47Var = (r47) it.next();
            it.remove();
            if (r47Var.e && (zzmwVar = this.e) != null) {
                zzmwVar.zzd(zzknVar, r47Var.a, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzg(zzmw zzmwVar) {
        this.e = zzmwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r1.zzd < r2) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zzmx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzkn r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzmw r0 = r9.e     // Catch: java.lang.Throwable -> Laa
            r0.getClass()
            com.google.android.gms.internal.ads.zzcn r0 = r10.zzb     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L10
            monitor-exit(r9)
            return
        L10:
            java.util.HashMap r0 = r9.c     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = r9.g     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Laa
            r47 r0 = (defpackage.r47) r0     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzsg r1 = r10.zzd     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L37
            if (r0 == 0) goto L37
            long r2 = r0.c     // Catch: java.lang.Throwable -> Laa
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2f
            int r0 = r0.b     // Catch: java.lang.Throwable -> Laa
            int r2 = r10.zzc     // Catch: java.lang.Throwable -> Laa
            if (r0 != r2) goto L35
            goto L37
        L2f:
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> Laa
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L37
        L35:
            monitor-exit(r9)
            return
        L37:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Laa
            r47 r0 = r9.a(r0, r1)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = r9.g     // Catch: java.lang.Throwable -> Laa
            if (r1 != 0) goto L45
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> Laa
            r9.g = r1     // Catch: java.lang.Throwable -> Laa
        L45:
            com.google.android.gms.internal.ads.zzsg r1 = r10.zzd     // Catch: java.lang.Throwable -> Laa
            r2 = 1
            if (r1 == 0) goto L89
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto L89
            com.google.android.gms.internal.ads.zzsg r3 = new com.google.android.gms.internal.ads.zzsg     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r4 = r1.zza     // Catch: java.lang.Throwable -> Laa
            long r5 = r1.zzd     // Catch: java.lang.Throwable -> Laa
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Laa
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> Laa
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Laa
            r47 r1 = r9.a(r1, r3)     // Catch: java.lang.Throwable -> Laa
            boolean r3 = r1.e     // Catch: java.lang.Throwable -> Laa
            if (r3 != 0) goto L89
            r1.e = r2     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzcn r1 = r10.zzb     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzsg r3 = r10.zzd     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r3 = r3.zza     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzck r4 = r9.b     // Catch: java.lang.Throwable -> Laa
            r1.zzn(r3, r4)     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzck r1 = r9.b     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzsg r3 = r10.zzd     // Catch: java.lang.Throwable -> Laa
            int r3 = r3.zzb     // Catch: java.lang.Throwable -> Laa
            r1.zzh(r3)     // Catch: java.lang.Throwable -> Laa
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzel.zzz(r3)     // Catch: java.lang.Throwable -> Laa
            long r7 = com.google.android.gms.internal.ads.zzel.zzz(r3)     // Catch: java.lang.Throwable -> Laa
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Laa
        L89:
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> Laa
            if (r1 != 0) goto L8f
            r0.e = r2     // Catch: java.lang.Throwable -> Laa
        L8f:
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = r9.g     // Catch: java.lang.Throwable -> Laa
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto La8
            boolean r1 = r0.f     // Catch: java.lang.Throwable -> Laa
            if (r1 != 0) goto La8
            r0.f = r2     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzmw r1 = r9.e     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> Laa
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r9)
            return
        La8:
            monitor-exit(r9)
            return
        Laa:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmt.zzh(com.google.android.gms.internal.ads.zzkn):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final synchronized void zzi(zzkn zzknVar, int i) {
        this.e.getClass();
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            r47 r47Var = (r47) it.next();
            if (r47Var.a(zzknVar)) {
                it.remove();
                if (r47Var.e) {
                    boolean zEquals = r47Var.a.equals(this.g);
                    boolean z = false;
                    if (i == 0 && zEquals && r47Var.f) {
                        z = true;
                    }
                    if (zEquals) {
                        this.g = null;
                    }
                    this.e.zzd(zzknVar, r47Var.a, z);
                }
            }
        }
        b(zzknVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final synchronized void zzj(zzkn zzknVar) {
        this.e.getClass();
        zzcn zzcnVar = this.f;
        this.f = zzknVar.zzb;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            r47 r47Var = (r47) it.next();
            if (!r47Var.b(zzcnVar, this.f) || r47Var.a(zzknVar)) {
                it.remove();
                if (r47Var.e) {
                    if (r47Var.a.equals(this.g)) {
                        this.g = null;
                    }
                    this.e.zzd(zzknVar, r47Var.a, false);
                }
            }
        }
        b(zzknVar);
    }

    public zzmt(zzfsv zzfsvVar) {
        this.d = zzfsvVar;
        this.a = new zzcm();
        this.b = new zzck();
        this.c = new HashMap();
        this.f = zzcn.zza;
    }
}
