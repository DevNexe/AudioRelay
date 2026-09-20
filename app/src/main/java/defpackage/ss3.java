package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzahy;
import com.google.android.gms.internal.ads.zzahz;
import com.google.android.gms.internal.ads.zzaih;
import com.google.android.gms.internal.ads.zzail;
import com.google.android.gms.internal.ads.zzakv;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzdpk;
import com.google.android.gms.internal.ads.zzdqj;
import com.google.android.gms.internal.ads.zzec;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzej;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfcv;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzzi;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ss3 implements zzahy, zzakv, MediationAdLoadCallback, zzbln, zzfyk, a46, hi6 {
    public final /* synthetic */ int w;
    public Object x;
    public final Object y;

    public /* synthetic */ ss3(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static ss3 c(Context context) {
        Throwable e;
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new ss3(22, channel, fileLockLock);
                } catch (IOException e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e4) {
                    e = e4;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e5) {
                e = e5;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e6) {
            e = e6;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // defpackage.a46
    public final ma5 a(ez5 ez5Var) {
        ma5 ma5VarA = ((ma5) this.x).a();
        String str = (String) this.y;
        ma5VarA.f(str, ez5Var);
        ((Map) ma5VarA.z).put(str, Boolean.TRUE);
        return ma5VarA;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006d A[Catch: all -> 0x00f3, TRY_LEAVE, TryCatch #0 {all -> 0x00f3, blocks: (B:13:0x0063, B:14:0x0067, B:16:0x006d, B:17:0x0073, B:18:0x008f, B:21:0x009a, B:22:0x00a1, B:24:0x00a3, B:25:0x00b1, B:27:0x00b3, B:29:0x00b7, B:32:0x00be, B:33:0x00bf), top: B:58:0x0063, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6 A[Catch: SQLiteException -> 0x00f1, all -> 0x0179, TryCatch #4 {SQLiteException -> 0x00f1, blocks: (B:12:0x0027, B:34:0x00c7, B:36:0x00dc, B:38:0x00e2, B:40:0x00ed, B:39:0x00e6, B:44:0x00f4, B:45:0x00fc), top: B:64:0x0027, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0129 A[Catch: all -> 0x0179, PHI: r10
  0x0129: PHI (r10v19 int) = (r10v2 int), (r10v0 int) binds: [B:11:0x0025, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0179, blocks: (B:4:0x0011, B:5:0x0013, B:47:0x0129, B:52:0x0168, B:51:0x0154, B:12:0x0027, B:34:0x00c7, B:36:0x00dc, B:38:0x00e2, B:40:0x00ed, B:39:0x00e6, B:44:0x00f4, B:45:0x00fc, B:46:0x00fd), top: B:59:0x0011, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0150  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:4:0x0011, B:5:0x0013, B:47:0x0129, B:52:0x0168, B:51:0x0154, B:12:0x0027, B:34:0x00c7, B:36:0x00dc, B:38:0x00e2, B:40:0x00ed, B:39:0x00e6, B:44:0x00f4, B:45:0x00fc, B:46:0x00fd), top: B:59:0x0011, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0099 A[SYNTHETIC] */
    @Override // defpackage.hi6
    public final void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        oi6 oi6Var;
        iy5 iy5Var;
        long jLongValue;
        r27 r27Var = (r27) this.y;
        r27Var.zzaz().e();
        r27Var.d();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                r27Var.t = false;
                r27Var.x();
                throw th2;
            }
        }
        ArrayList<Long> arrayList = r27Var.x;
        oa3.h(arrayList);
        r27Var.x = null;
        if (i == 200) {
            if (th == null) {
                try {
                    bj6 bj6Var = r27Var.i.g;
                    ((jg0) r27Var.b()).getClass();
                    bj6Var.b(System.currentTimeMillis());
                    r27Var.i.h.b(0L);
                    r27Var.z();
                    r27Var.zzay().n.d(Integer.valueOf(i), "Successful upload. Got network response. code, size", Integer.valueOf(bArr.length));
                    iy5 iy5Var2 = r27Var.c;
                    r27.E(iy5Var2);
                    iy5Var2.K();
                    try {
                        for (Long l : arrayList) {
                            try {
                                iy5Var = r27Var.c;
                                r27.E(iy5Var);
                                jLongValue = l.longValue();
                                iy5Var.e();
                                iy5Var.f();
                                try {
                                    if (iy5Var.x().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    bi6 bi6Var = iy5Var.a.i;
                                    dq6.h(bi6Var);
                                    bi6Var.f.c(e, "Failed to delete a bundle in a queue table");
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                ArrayList arrayList2 = r27Var.y;
                                if (arrayList2 == null || !arrayList2.contains(l)) {
                                    throw e2;
                                }
                            }
                        }
                        iy5 iy5Var3 = r27Var.c;
                        r27.E(iy5Var3);
                        iy5Var3.j();
                        iy5 iy5Var4 = r27Var.c;
                        r27.E(iy5Var4);
                        iy5Var4.L();
                        r27Var.y = null;
                        oi6Var = r27Var.b;
                        r27.E(oi6Var);
                        if (oi6Var.d() || !r27Var.B()) {
                            r27Var.z = -1L;
                            r27Var.z();
                        } else {
                            r27Var.q();
                        }
                        r27Var.o = 0L;
                    } catch (Throwable th3) {
                        iy5 iy5Var5 = r27Var.c;
                        r27.E(iy5Var5);
                        iy5Var5.L();
                        throw th3;
                    }
                } catch (SQLiteException e3) {
                    r27Var.zzay().f.c(e3, "Database error while trying to delete uploaded bundles");
                    ((jg0) r27Var.b()).getClass();
                    r27Var.o = SystemClock.elapsedRealtime();
                    r27Var.zzay().n.c(Long.valueOf(r27Var.o), "Disable upload, time");
                }
            } else {
                r27Var.zzay().n.d(Integer.valueOf(i), "Network upload failed. Will retry later. code, error", th);
                bj6 bj6Var2 = r27Var.i.h;
                ((jg0) r27Var.b()).getClass();
                bj6Var2.b(System.currentTimeMillis());
                if (i != 503 || i == 429) {
                    bj6 bj6Var3 = r27Var.i.f;
                    ((jg0) r27Var.b()).getClass();
                    bj6Var3.b(System.currentTimeMillis());
                }
                iy5 iy5Var6 = r27Var.c;
                r27.E(iy5Var6);
                iy5Var6.M(arrayList);
                r27Var.z();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                bj6 bj6Var4 = r27Var.i.g;
                ((jg0) r27Var.b()).getClass();
                bj6Var4.b(System.currentTimeMillis());
                r27Var.i.h.b(0L);
                r27Var.z();
                r27Var.zzay().n.d(Integer.valueOf(i), "Successful upload. Got network response. code, size", Integer.valueOf(bArr.length));
                iy5 iy5Var7 = r27Var.c;
                r27.E(iy5Var7);
                iy5Var7.K();
                while (r10.hasNext()) {
                    iy5Var = r27Var.c;
                    r27.E(iy5Var);
                    jLongValue = l.longValue();
                    iy5Var.e();
                    iy5Var.f();
                    if (iy5Var.x().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                iy5 iy5Var8 = r27Var.c;
                r27.E(iy5Var8);
                iy5Var8.j();
                iy5 iy5Var9 = r27Var.c;
                r27.E(iy5Var9);
                iy5Var9.L();
                r27Var.y = null;
                oi6Var = r27Var.b;
                r27.E(oi6Var);
                if (oi6Var.d()) {
                    r27Var.z = -1L;
                    r27Var.z();
                } else {
                    r27Var.z = -1L;
                    r27Var.z();
                }
                r27Var.o = 0L;
            } else {
                r27Var.zzay().n.d(Integer.valueOf(i), "Network upload failed. Will retry later. code, error", th);
                bj6 bj6Var5 = r27Var.i.h;
                ((jg0) r27Var.b()).getClass();
                bj6Var5.b(System.currentTimeMillis());
                if (i != 503) {
                    bj6 bj6Var6 = r27Var.i.f;
                    ((jg0) r27Var.b()).getClass();
                    bj6Var6.b(System.currentTimeMillis());
                } else {
                    bj6 bj6Var7 = r27Var.i.f;
                    ((jg0) r27Var.b()).getClass();
                    bj6Var7.b(System.currentTimeMillis());
                }
                iy5 iy5Var10 = r27Var.c;
                r27.E(iy5Var10);
                iy5Var10.M(arrayList);
                r27Var.z();
            }
        } else {
            r27Var.zzay().n.d(Integer.valueOf(i), "Network upload failed. Will retry later. code, error", th);
            bj6 bj6Var8 = r27Var.i.h;
            ((jg0) r27Var.b()).getClass();
            bj6Var8.b(System.currentTimeMillis());
            if (i != 503) {
                bj6 bj6Var9 = r27Var.i.f;
                ((jg0) r27Var.b()).getClass();
                bj6Var9.b(System.currentTimeMillis());
            } else {
                bj6 bj6Var10 = r27Var.i.f;
                ((jg0) r27Var.b()).getClass();
                bj6Var10.b(System.currentTimeMillis());
            }
            iy5 iy5Var11 = r27Var.c;
            r27.E(iy5Var11);
            iy5Var11.M(arrayList);
            r27Var.z();
        }
        r27Var.t = false;
        r27Var.x();
    }

    public final void d(long j, cd1 cd1Var) {
        uo2 uo2Var;
        xo2 xo2Var = (xo2) this.y;
        int i = cd1Var.z;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            j93 j93Var = (j93) cd1Var.w[i2];
            if (z) {
                ui2<uo2> ui2Var = xo2Var.a;
                int i3 = ui2Var.y;
                if (i3 <= 0) {
                    uo2Var = null;
                    break;
                }
                uo2[] uo2VarArr = ui2Var.w;
                int i4 = 0;
                while (true) {
                    uo2Var = uo2VarArr[i4];
                    if (ur1.a(uo2Var.b, j93Var)) {
                        break;
                    }
                    i4++;
                    if (i4 >= i3) {
                        uo2Var = null;
                        break;
                    }
                }
                uo2 uo2Var2 = uo2Var;
                if (uo2Var2 != null) {
                    uo2Var2.h = true;
                    c93 c93Var = new c93(j);
                    ui2<c93> ui2Var2 = uo2Var2.c;
                    if (!ui2Var2.f(c93Var)) {
                        ui2Var2.b(new c93(j));
                    }
                    xo2Var = uo2Var2;
                } else {
                    z = false;
                    uo2 uo2Var3 = new uo2(j93Var);
                    uo2Var3.c.b(new c93(j));
                    xo2Var.a.b(uo2Var3);
                    xo2Var = uo2Var3;
                }
            } else {
                uo2 uo2Var4 = new uo2(j93Var);
                uo2Var4.c.b(new c93(j));
                xo2Var.a.b(uo2Var4);
                xo2Var = uo2Var4;
            }
        }
    }

    public final void e() {
        try {
            fx0 fx0Var = (fx0) this.y;
            String str = (String) this.x;
            fx0Var.getClass();
            new File(fx0Var.b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + ((String) this.x), e);
        }
    }

    public final void f() {
        try {
            ((FileLock) this.y).release();
            ((FileChannel) this.x).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public final void g(C.k kVar) {
        ts3 ts3Var = (ts3) ((Map) this.x).get(kVar);
        if (ts3Var != null) {
        }
        ((Map) this.x).remove(kVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        switch (this.w) {
            case 8:
                try {
                    ((zzbwm) this.x).zzf(adError.zza());
                } catch (RemoteException e) {
                    zzcgn.zzh("", e);
                    return;
                }
                break;
            default:
                try {
                    ((zzbws) this.x).zzf(adError.zza());
                } catch (RemoteException e2) {
                    zzcgn.zzh("", e2);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        int i = this.w;
        Object obj2 = this.y;
        switch (i) {
            case 8:
                MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
                if (mediationBannerAd != null) {
                    try {
                        ((zzbwm) this.x).zzg(new ObjectWrapper(mediationBannerAd.getView()));
                        break;
                    } catch (RemoteException e) {
                        zzcgn.zzh("", e);
                    }
                    return new p66((zzbvl) obj2);
                }
                zzcgn.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    ((zzbwm) this.x).zze("Adapter returned null.");
                    return null;
                } catch (RemoteException e2) {
                    zzcgn.zzh("", e2);
                    return null;
                }
            default:
                UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
                if (unifiedNativeAdMapper != null) {
                    try {
                        ((zzbws) this.x).zzg(new zzbwj(unifiedNativeAdMapper));
                        break;
                    } catch (RemoteException e3) {
                        zzcgn.zzh("", e3);
                    }
                    return new p66((zzbvl) obj2);
                }
                zzcgn.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    ((zzbws) this.x).zze("Adapter returned null.");
                    return null;
                } catch (RemoteException e4) {
                    zzcgn.zzh("", e4);
                    return null;
                }
        }
    }

    public final String toString() {
        switch (this.w) {
            case 23:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.x);
                sb.append(' ');
                List list = (List) this.y;
                sb.append(list.isEmpty() ? "" : ", ".concat(wu.M0(list, ",", null, null, null, 62)));
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final File zza() {
        if (((File) this.x) == null) {
            this.x = new File(((Context) this.y).getCacheDir(), "volley");
        }
        return (File) this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final JSONObject zzb() {
        return ((zzdqj) this.x).zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zzb(zzej zzejVar, zzzi zzziVar, zzail zzailVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbyb, com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        zzdqj zzdqjVar = (zzdqj) this.x;
        zzfuv zzfuvVar = zzdpk.zza;
        Map mapZzm = zzdqjVar.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = zzfuvVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (mapZzm.get((String) zzfuvVar.get(i)) != null) {
                ((zzdqj) this.x).onClick((ViewGroup) this.y);
                return;
            }
            i = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final void zzd(MotionEvent motionEvent) {
        ((zzdqj) this.x).onTouch(null, motionEvent);
    }

    public ss3(Context context) {
        this.w = 7;
        this.y = context;
        this.x = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final JSONObject mo46zza() {
        return ((zzdqj) this.x).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final void mo32zzb(Object obj) {
        int i = this.w;
        Object obj2 = this.y;
        switch (i) {
            case 11:
                ((zzcmn) obj).zzaf((String) this.x, (zzbpq) obj2);
                break;
            case 12:
                ((zzcmn) obj).zzV((zzfcs) this.x, (zzfcv) obj2);
                break;
            case 13:
                ((zzfhg) obj2).f.c.zzd((zzfgu) this.x);
                break;
        }
    }

    public ss3(zzaih zzaihVar) {
        this.w = 6;
        this.y = zzaihVar;
        this.x = new zzec(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zza(zzed zzedVar) {
        if (zzedVar.zzk() != 0 || (zzedVar.zzk() & 128) == 0) {
            return;
        }
        zzedVar.zzG(6);
        int iZza = zzedVar.zza() / 4;
        int i = 0;
        while (true) {
            Object obj = this.y;
            if (i < iZza) {
                zzedVar.zzA((zzec) this.x, 4);
                int iZzc = ((zzec) this.x).zzc(16);
                ((zzec) this.x).zzj(3);
                if (iZzc == 0) {
                    ((zzec) this.x).zzj(13);
                } else {
                    int iZzc2 = ((zzec) this.x).zzc(13);
                    if (((zzaih) obj).e.get(iZzc2) == null) {
                        zzaih zzaihVar = (zzaih) obj;
                        zzaihVar.e.put(iZzc2, new zzahz(new dw5(zzaihVar, iZzc2)));
                        ((zzaih) obj).k++;
                    }
                }
                i++;
            } else {
                ((zzaih) obj).e.remove(0);
                return;
            }
        }
    }

    public /* synthetic */ ss3(Object obj, Object obj2, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public /* synthetic */ ss3(Object obj, Object obj2, int i, int i2) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.w) {
            case 8:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }

    public ss3(UUID uuid, byte[] bArr) {
        this.w = 5;
        this.x = uuid;
        this.y = bArr;
    }

    public ss3(eg2 eg2Var, cc2 cc2Var) {
        this.w = 3;
        this.x = eg2Var;
        this.y = cc2Var;
    }

    public ss3(sm3 sm3Var, lKy3 lky3) {
        this.w = 2;
        this.x = sm3Var;
        this.y = lky3;
    }

    public ss3(String str, ArrayList arrayList) {
        this.w = 23;
        this.x = str;
        this.y = arrayList;
    }

    public ss3(cd4 cd4Var, uz4 uz4Var) {
        this.w = 4;
        this.x = cd4Var;
        this.y = uz4Var;
    }

    public ss3(pn1 pn1Var) {
        this.w = 1;
        this.x = pn1Var;
        this.y = new xo2();
    }

    public ss3(int i) {
        this.w = i;
        if (i != 21) {
            this.x = new LinkedHashMap();
            this.y = new LinkedHashMap();
        } else {
            this.x = new AtomicInteger();
            this.y = new AtomicInteger();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        int i = this.w;
        Object obj = this.y;
        switch (i) {
            case 11:
            case 12:
                break;
            case 13:
                ((zzfhg) obj).f.c.zzb((zzfgu) this.x, th);
                break;
            default:
                zzfjc zzfjcVar = (zzfjc) this.x;
                zzfir zzfirVar = (zzfir) obj;
                zzfirVar.zze(false);
                zzfjcVar.zza(zzfirVar);
                break;
        }
    }
}
