package com.google.android.gms.internal.ads;

import defpackage.gh1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnt {
    public final zzaru a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public zzfnt(zzaru zzaruVar, File file, File file2, File file3) {
        this.a = zzaruVar;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }

    public final zzaru zza() {
        return this.a;
    }

    public final File zzb() {
        return this.c;
    }

    public final File zzc() {
        return this.b;
    }

    public final boolean zzd(long j) {
        return this.a.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] zze() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzE;
        FileInputStream fileInputStream2 = null;
        if (this.e == null) {
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    bArrZzE = zzgnf.zzy(fileInputStream).zzE();
                    gh1.a(fileInputStream);
                } catch (IOException unused) {
                    gh1.a(fileInputStream);
                    bArrZzE = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    gh1.a(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.e = bArrZzE;
        }
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
