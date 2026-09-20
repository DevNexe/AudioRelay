package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.zc1;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfob {
    public static final Object f = new Object();
    public final Context a;
    public final SharedPreferences b;
    public final String c;
    public final zzfni d;
    public final boolean e;

    public zzfob(Context context, int i, zzfni zzfniVar, boolean z) {
        this.e = false;
        this.a = context;
        this.c = Integer.toString(i - 1);
        this.b = context.getSharedPreferences("pcvmspf", 0);
        this.d = zzfniVar;
        this.e = z;
    }

    public static String b(zzarr zzarrVar) {
        zzart zzartVarZze = zzaru.zze();
        zzartVarZze.zze(zzarrVar.zzd().zzk());
        zzartVarZze.zza(zzarrVar.zzd().zzj());
        zzartVarZze.zzb(zzarrVar.zzd().zza());
        zzartVarZze.zzd(zzarrVar.zzd().zzd());
        zzartVarZze.zzc(zzarrVar.zzd().zzc());
        return zc1.a(((zzaru) zzartVarZze.zzal()).zzas().zzE());
    }

    public final File a(String str) {
        return new File(new File(this.a.getDir("pccache", 0), this.c), str);
    }

    public final String c() {
        return "LATMTD".concat(String.valueOf(this.c));
    }

    public final void d(int i, long j) {
        zzfni zzfniVar = this.d;
        if (zzfniVar != null) {
            zzfniVar.zza(i, j);
        }
    }

    public final zzaru e(int i) {
        SharedPreferences sharedPreferences = this.b;
        String string = i == 1 ? sharedPreferences.getString(c(), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(this.c)), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            return zzaru.zzi(zzgnf.zzv(zc1.f(string)), this.e ? zzgnz.zza() : zzgnz.zzb());
        } catch (zzgoz unused) {
            return null;
        } catch (NullPointerException unused2) {
            d(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            d(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzarr zzarrVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            if (!zzfnv.zze(new File(a(zzarrVar.zzd().zzk()), "pcbc"), zzarrVar.zze().zzE())) {
                d(4020, jCurrentTimeMillis);
                return false;
            }
            String strB = b(zzarrVar);
            SharedPreferences.Editor editorEdit = this.b.edit();
            editorEdit.putString(c(), strB);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                d(5015, jCurrentTimeMillis);
            } else {
                d(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final boolean zzb(zzarr zzarrVar, zzfoa zzfoaVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            zzaru zzaruVarE = e(1);
            String strZzk = zzarrVar.zzd().zzk();
            if (zzaruVarE != null && zzaruVarE.zzk().equals(strZzk)) {
                d(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileA = a(strZzk);
            if (fileA.exists()) {
                String str = "d:" + (true != fileA.isDirectory() ? "0" : "1") + ",f:" + (true != fileA.isFile() ? "0" : "1");
                zzfni zzfniVar = this.d;
                if (zzfniVar != null) {
                    zzfniVar.zzb(4023, jCurrentTimeMillis2, str);
                }
                d(4015, jCurrentTimeMillis2);
            } else if (!fileA.mkdirs()) {
                String strConcat = "cw:".concat(true != fileA.canWrite() ? "0" : "1");
                zzfni zzfniVar2 = this.d;
                if (zzfniVar2 != null) {
                    zzfniVar2.zzb(4024, jCurrentTimeMillis2, strConcat);
                }
                d(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileA2 = a(strZzk);
            File file = new File(fileA2, "pcam.jar");
            File file2 = new File(fileA2, "pcbc");
            if (!zzfnv.zze(file, zzarrVar.zzf().zzE())) {
                d(4016, jCurrentTimeMillis);
                return false;
            }
            if (!zzfnv.zze(file2, zzarrVar.zze().zzE())) {
                d(4017, jCurrentTimeMillis);
                return false;
            }
            if (zzfoaVar != null && !zzfoaVar.zza(file)) {
                d(4018, jCurrentTimeMillis);
                zzfnv.zzd(fileA2);
                return false;
            }
            String strB = b(zzarrVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string = this.b.getString(c(), null);
            SharedPreferences.Editor editorEdit = this.b.edit();
            editorEdit.putString(c(), strB);
            if (string != null) {
                editorEdit.putString("FBAMTD".concat(String.valueOf(this.c)), string);
            }
            if (!editorEdit.commit()) {
                d(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            zzaru zzaruVarE2 = e(1);
            if (zzaruVarE2 != null) {
                hashSet.add(zzaruVarE2.zzk());
            }
            zzaru zzaruVarE3 = e(2);
            if (zzaruVarE3 != null) {
                hashSet.add(zzaruVarE3.zzk());
            }
            for (File file3 : new File(this.a.getDir("pccache", 0), this.c).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    zzfnv.zzd(file3);
                }
            }
            d(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final zzfnt zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            zzaru zzaruVarE = e(1);
            if (zzaruVarE == null) {
                d(4022, jCurrentTimeMillis);
                return null;
            }
            File fileA = a(zzaruVarE.zzk());
            File file = new File(fileA, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileA, "pcam");
            }
            File file2 = new File(fileA, "pcbc");
            File file3 = new File(fileA, "pcopt");
            d(5016, jCurrentTimeMillis);
            return new zzfnt(zzaruVarE, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            zzaru zzaruVarE = e(1);
            if (zzaruVarE == null) {
                d(4025, jCurrentTimeMillis);
                return false;
            }
            File fileA = a(zzaruVarE.zzk());
            if (!new File(fileA, "pcam.jar").exists()) {
                d(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileA, "pcbc").exists()) {
                d(5019, jCurrentTimeMillis);
                return true;
            }
            d(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
