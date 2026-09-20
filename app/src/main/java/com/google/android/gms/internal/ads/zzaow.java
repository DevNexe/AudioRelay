package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import defpackage.dz5;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaow {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile zzfoh d = null;
    public static volatile Random e = null;
    public final zzaqb a;
    public volatile Boolean b;

    public zzaow(zzaqb zzaqbVar) {
        this.a = zzaqbVar;
        zzaqbVar.zzk().execute(new dz5(this, 0));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (e == null) {
                synchronized (zzaow.class) {
                    if (e == null) {
                        e = new Random();
                    }
                }
            }
            return e.nextInt();
        }
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            zzalt zzaltVarZza = zzalx.zza();
            zzaltVarZza.zza(this.a.a.getPackageName());
            zzaltVarZza.zze(j);
            if (str != null) {
                zzaltVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzaltVarZza.zzf(stringWriter.toString());
                zzaltVarZza.zzd(exc.getClass().getName());
            }
            zzfog zzfogVarZza = d.zza(((zzalx) zzaltVarZza.zzal()).zzaw());
            zzfogVarZza.zza(i);
            if (i2 != -1) {
                zzfogVarZza.zzb(i2);
            }
            zzfogVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
