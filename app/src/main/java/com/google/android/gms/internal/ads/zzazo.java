package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzazo extends IOException {
    public final zzazk zza;

    public zzazo(IOException iOException, zzazk zzazkVar, int i) {
        super(iOException);
        this.zza = zzazkVar;
    }

    public zzazo(String str, zzazk zzazkVar, int i) {
        super(str);
        this.zza = zzazkVar;
    }

    public zzazo(String str, IOException iOException, zzazk zzazkVar, int i) {
        super(str, iOException);
        this.zza = zzazkVar;
    }
}
