package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbk {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;

    public zzbk() {
    }

    public /* synthetic */ zzbk(zzbm zzbmVar) {
        this.a = zzbmVar.zzc;
        this.b = zzbmVar.zzd;
        this.c = zzbmVar.zze;
        this.d = zzbmVar.zzf;
        this.e = zzbmVar.zzg;
        this.f = zzbmVar.zzh;
        this.g = zzbmVar.zzi;
        this.h = zzbmVar.zzj;
        this.i = zzbmVar.zzk;
        this.j = zzbmVar.zzm;
        this.k = zzbmVar.zzn;
        this.l = zzbmVar.zzo;
        this.m = zzbmVar.zzp;
        this.n = zzbmVar.zzq;
        this.o = zzbmVar.zzr;
        this.p = zzbmVar.zzs;
        this.q = zzbmVar.zzt;
        this.r = zzbmVar.zzu;
        this.s = zzbmVar.zzv;
        this.t = zzbmVar.zzw;
    }

    public final zzbk zza(byte[] bArr, int i) {
        if (this.f == null || zzel.zzT(Integer.valueOf(i), 3) || !zzel.zzT(this.g, 3)) {
            this.f = (byte[]) bArr.clone();
            this.g = Integer.valueOf(i);
        }
        return this;
    }

    public final zzbk zzb(zzbm zzbmVar) {
        CharSequence charSequence = zzbmVar.zzc;
        if (charSequence != null) {
            this.a = charSequence;
        }
        CharSequence charSequence2 = zzbmVar.zzd;
        if (charSequence2 != null) {
            this.b = charSequence2;
        }
        CharSequence charSequence3 = zzbmVar.zze;
        if (charSequence3 != null) {
            this.c = charSequence3;
        }
        CharSequence charSequence4 = zzbmVar.zzf;
        if (charSequence4 != null) {
            this.d = charSequence4;
        }
        CharSequence charSequence5 = zzbmVar.zzg;
        if (charSequence5 != null) {
            this.e = charSequence5;
        }
        byte[] bArr = zzbmVar.zzh;
        if (bArr != null) {
            zzf(bArr, zzbmVar.zzi);
        }
        Integer num = zzbmVar.zzj;
        if (num != null) {
            this.h = num;
        }
        Integer num2 = zzbmVar.zzk;
        if (num2 != null) {
            this.i = num2;
        }
        Integer num3 = zzbmVar.zzl;
        if (num3 != null) {
            this.j = num3;
        }
        Integer num4 = zzbmVar.zzm;
        if (num4 != null) {
            this.j = num4;
        }
        Integer num5 = zzbmVar.zzn;
        if (num5 != null) {
            this.k = num5;
        }
        Integer num6 = zzbmVar.zzo;
        if (num6 != null) {
            this.l = num6;
        }
        Integer num7 = zzbmVar.zzp;
        if (num7 != null) {
            this.m = num7;
        }
        Integer num8 = zzbmVar.zzq;
        if (num8 != null) {
            this.n = num8;
        }
        Integer num9 = zzbmVar.zzr;
        if (num9 != null) {
            this.o = num9;
        }
        CharSequence charSequence6 = zzbmVar.zzs;
        if (charSequence6 != null) {
            this.p = charSequence6;
        }
        CharSequence charSequence7 = zzbmVar.zzt;
        if (charSequence7 != null) {
            this.q = charSequence7;
        }
        CharSequence charSequence8 = zzbmVar.zzu;
        if (charSequence8 != null) {
            this.r = charSequence8;
        }
        CharSequence charSequence9 = zzbmVar.zzv;
        if (charSequence9 != null) {
            this.s = charSequence9;
        }
        CharSequence charSequence10 = zzbmVar.zzw;
        if (charSequence10 != null) {
            this.t = charSequence10;
        }
        return this;
    }

    public final zzbk zzc(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public final zzbk zzd(CharSequence charSequence) {
        this.c = charSequence;
        return this;
    }

    public final zzbk zze(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final zzbk zzf(byte[] bArr, Integer num) {
        this.f = (byte[]) bArr.clone();
        this.g = num;
        return this;
    }

    public final zzbk zzg(CharSequence charSequence) {
        this.q = charSequence;
        return this;
    }

    public final zzbk zzh(CharSequence charSequence) {
        this.r = charSequence;
        return this;
    }

    public final zzbk zzi(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public final zzbk zzj(CharSequence charSequence) {
        this.s = charSequence;
        return this;
    }

    public final zzbk zzk(Integer num) {
        this.l = num;
        return this;
    }

    public final zzbk zzl(Integer num) {
        this.k = num;
        return this;
    }

    public final zzbk zzm(Integer num) {
        this.j = num;
        return this;
    }

    public final zzbk zzn(Integer num) {
        this.o = num;
        return this;
    }

    public final zzbk zzo(Integer num) {
        this.n = num;
        return this;
    }

    public final zzbk zzp(Integer num) {
        this.m = num;
        return this;
    }

    public final zzbk zzq(CharSequence charSequence) {
        this.t = charSequence;
        return this;
    }

    public final zzbk zzr(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final zzbk zzs(Integer num) {
        this.i = num;
        return this;
    }

    public final zzbk zzt(Integer num) {
        this.h = num;
        return this;
    }

    public final zzbk zzu(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    public final zzbm zzv() {
        return new zzbm(this);
    }
}
