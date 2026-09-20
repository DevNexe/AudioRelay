package com.google.android.gms.internal.ads;

import defpackage.a42;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbcb {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final zzbcq e;
    public final zzbcy f;
    public int n;
    public final Object g = new Object();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public String o = "";
    public String p = "";
    public String q = "";

    public zzbcb(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = new zzbcq(i4);
        this.f = new zzbcy(i5, i6, i7);
    }

    public static final String b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final void a(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.c) {
            return;
        }
        synchronized (this.g) {
            this.h.add(str);
            this.k += str.length();
            if (z) {
                this.i.add(str);
                this.j.add(new zzbcm(f, f2, f3, f4, this.i.size() - 1));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbcb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbcb) obj).o;
        return str != null && str.equals(this.o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        int i = this.l;
        int i2 = this.n;
        int i3 = this.k;
        String strB = b(this.h);
        String strB2 = b(this.i);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        StringBuilder sbA = a42.a("ActivityContent fetchId: ", i, " score:", i2, " total_length:");
        sbA.append(i3);
        sbA.append("\n text: ");
        sbA.append(strB);
        sbA.append("\n viewableText");
        sbA.append(strB2);
        sbA.append("\n signture: ");
        sbA.append(str);
        sbA.append("\n viewableSignture: ");
        sbA.append(str2);
        sbA.append("\n viewableSignatureForVertical: ");
        sbA.append(str3);
        return sbA.toString();
    }

    public final int zzb() {
        return this.n;
    }

    public final String zzd() {
        return this.o;
    }

    public final String zze() {
        return this.p;
    }

    public final String zzf() {
        return this.q;
    }

    public final void zzg() {
        synchronized (this.g) {
            this.m--;
        }
    }

    public final void zzh() {
        synchronized (this.g) {
            this.m++;
        }
    }

    public final void zzi() {
        synchronized (this.g) {
            this.n -= 100;
        }
    }

    public final void zzj(int i) {
        this.l = i;
    }

    public final void zzk(String str, boolean z, float f, float f2, float f3, float f4) {
        a(str, z, f, f2, f3, f4);
    }

    public final void zzl(String str, boolean z, float f, float f2, float f3, float f4) {
        a(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            if (this.m < 0) {
                zzcgn.zze("ActivityContent: negative number of WebViews.");
            }
            zzm();
        }
    }

    public final void zzm() {
        synchronized (this.g) {
            int i = this.k;
            int i2 = this.l;
            boolean z = this.d;
            int i3 = this.b;
            if (!z) {
                i3 = (i2 * i3) + (i * this.a);
            }
            if (i3 > this.n) {
                this.n = i3;
                if (!com.google.android.gms.ads.internal.zzt.zzp().zzh().zzM()) {
                    this.o = this.e.zza(this.h);
                    this.p = this.e.zza(this.i);
                }
                if (!com.google.android.gms.ads.internal.zzt.zzp().zzh().zzN()) {
                    this.q = this.f.zza(this.i, this.j);
                }
            }
        }
    }

    public final void zzn() {
        synchronized (this.g) {
            int i = this.k;
            int i2 = this.l;
            boolean z = this.d;
            int i3 = this.b;
            if (!z) {
                i3 = (i2 * i3) + (i * this.a);
            }
            if (i3 > this.n) {
                this.n = i3;
            }
        }
    }

    public final boolean zzo() {
        boolean z;
        synchronized (this.g) {
            z = this.m == 0;
        }
        return z;
    }
}
