package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.qc0;
import defpackage.sd6;
import defpackage.yx5;
import defpackage.zx5;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakw implements zzajk {
    public final zzakv c;
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 5242880;

    public zzakw(zzakv zzakvVar, int i) {
        this.c = zzakvVar;
    }

    public static long a(InputStream inputStream) {
        return (((long) g(inputStream)) & 255) | ((((long) g(inputStream)) & 255) << 8) | ((((long) g(inputStream)) & 255) << 16) | ((((long) g(inputStream)) & 255) << 24) | ((((long) g(inputStream)) & 255) << 32) | ((((long) g(inputStream)) & 255) << 40) | ((((long) g(inputStream)) & 255) << 48) | ((255 & ((long) g(inputStream))) << 56);
    }

    public static String b(zx5 zx5Var) {
        return new String(f(zx5Var, a(zx5Var)), "UTF-8");
    }

    public static void c(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void d(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static void e(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        d(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static byte[] f(zx5 zx5Var, long j) throws IOException {
        long j2 = zx5Var.w - zx5Var.x;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zx5Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbB = qc0.b("streamToBytes length=", j, ", maxLength=");
        sbB.append(j2);
        throw new IOException(sbB.toString());
    }

    public static int g(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static final String i(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final void h(String str, yx5 yx5Var) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(str)) {
            this.b = (yx5Var.a - ((yx5) linkedHashMap.get(str)).a) + this.b;
        } else {
            this.b += yx5Var.a;
        }
        linkedHashMap.put(str, yx5Var);
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final synchronized zzajj zza(String str) {
        yx5 yx5Var = (yx5) this.a.get(str);
        if (yx5Var == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zx5 zx5Var = new zx5(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                yx5 yx5VarA = yx5.a(zx5Var);
                if (!TextUtils.equals(str, yx5VarA.b)) {
                    zzakm.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, yx5VarA.b);
                    yx5 yx5Var2 = (yx5) this.a.remove(str);
                    if (yx5Var2 != null) {
                        this.b -= yx5Var2.a;
                    }
                    zx5Var.close();
                    return null;
                }
                byte[] bArrF = f(zx5Var, zx5Var.w - zx5Var.x);
                zzajj zzajjVar = new zzajj();
                zzajjVar.zza = bArrF;
                zzajjVar.zzb = yx5Var.c;
                zzajjVar.zzc = yx5Var.d;
                zzajjVar.zzd = yx5Var.e;
                zzajjVar.zze = yx5Var.f;
                zzajjVar.zzf = yx5Var.g;
                List<zzajs> list = yx5Var.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzajs zzajsVar : list) {
                    treeMap.put(zzajsVar.zza(), zzajsVar.zzb());
                }
                zzajjVar.zzg = treeMap;
                zzajjVar.zzh = Collections.unmodifiableList(yx5Var.h);
                zx5Var.close();
                return zzajjVar;
            } catch (Throwable th) {
                zx5Var.close();
                throw th;
            }
        } catch (IOException e) {
            zzakm.zza("%s: %s", fileZzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final synchronized void zzb() {
        File fileZza = this.c.zza();
        if (!fileZza.exists()) {
            if (fileZza.mkdirs()) {
                return;
            }
            zzakm.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = fileZza.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                long length = file.length();
                zx5 zx5Var = new zx5(new BufferedInputStream(new FileInputStream(file)), length);
                try {
                    yx5 yx5VarA = yx5.a(zx5Var);
                    yx5VarA.a = length;
                    h(yx5VarA.b, yx5VarA);
                    zx5Var.close();
                } catch (Throwable th) {
                    zx5Var.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final synchronized void zzc(String str, boolean z) {
        zzajj zzajjVarZza = zza(str);
        if (zzajjVarZza != null) {
            zzajjVarZza.zzf = 0L;
            zzajjVarZza.zze = 0L;
            zzd(str, zzajjVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final synchronized void zzd(String str, zzajj zzajjVar) {
        long j = this.b;
        int length = zzajjVar.zza.length;
        int i = this.d;
        if (j + ((long) length) > i && length > i * 0.9f) {
            return;
        }
        File fileZzg = zzg(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
            yx5 yx5Var = new yx5(str, zzajjVar);
            try {
                c(bufferedOutputStream, 538247942);
                e(bufferedOutputStream, str);
                String str2 = yx5Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                e(bufferedOutputStream, str2);
                d(bufferedOutputStream, yx5Var.d);
                d(bufferedOutputStream, yx5Var.e);
                d(bufferedOutputStream, yx5Var.f);
                d(bufferedOutputStream, yx5Var.g);
                List<zzajs> list = yx5Var.h;
                if (list != null) {
                    c(bufferedOutputStream, list.size());
                    for (zzajs zzajsVar : list) {
                        e(bufferedOutputStream, zzajsVar.zza());
                        e(bufferedOutputStream, zzajsVar.zzb());
                    }
                } else {
                    c(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(zzajjVar.zza);
                bufferedOutputStream.close();
                yx5Var.a = fileZzg.length();
                h(str, yx5Var);
                if (this.b >= this.d) {
                    if (zzakm.zzb) {
                        zzakm.zzd("Pruning old cache entries.", new Object[0]);
                    }
                    long j2 = this.b;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator it = this.a.entrySet().iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            jElapsedRealtime = jElapsedRealtime;
                            break;
                        }
                        yx5 yx5Var2 = (yx5) ((Map.Entry) it.next()).getValue();
                        if (zzg(yx5Var2.b).delete()) {
                            this.b -= yx5Var2.a;
                        } else {
                            String str3 = yx5Var2.b;
                            zzakm.zza("Could not delete cache entry for key=%s, filename=%s", str3, i(str3));
                        }
                        it.remove();
                        i2++;
                        if (this.b < this.d * 0.9f) {
                            break;
                        } else {
                            jElapsedRealtime = jElapsedRealtime;
                        }
                    }
                    if (zzakm.zzb) {
                        zzakm.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j2), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    }
                }
            } catch (IOException e) {
                zzakm.zza("%s", e.toString());
                bufferedOutputStream.close();
                zzakm.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!fileZzg.delete()) {
                zzakm.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
            }
            if (!this.c.zza().exists()) {
                zzakm.zza("Re-initializing cache after external clearing.", new Object[0]);
                this.a.clear();
                this.b = 0L;
                zzb();
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.c.zza(), i(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        yx5 yx5Var = (yx5) this.a.remove(str);
        if (yx5Var != null) {
            this.b -= yx5Var.a;
        }
        if (zDelete) {
            return;
        }
        zzakm.zza("Could not delete cache entry for key=%s, filename=%s", str, i(str));
    }

    public zzakw(File file, int i) {
        this.c = new sd6(1, file);
    }
}
