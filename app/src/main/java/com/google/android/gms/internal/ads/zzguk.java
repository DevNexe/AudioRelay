package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzguk {
    public static final zzguk zza = new zzguk(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzguk zzb = new zzguk(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzguk zzc = new zzguk(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzguk zzd = new zzguk(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    public zzguk(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zze = d5;
        this.zzf = d6;
        this.zzg = d7;
        this.zzh = d;
        this.zzi = d2;
        this.zzj = d3;
        this.zzk = d4;
        this.zzl = d8;
        this.zzm = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzguk.class != obj.getClass()) {
            return false;
        }
        zzguk zzgukVar = (zzguk) obj;
        return Double.compare(zzgukVar.zzh, this.zzh) == 0 && Double.compare(zzgukVar.zzi, this.zzi) == 0 && Double.compare(zzgukVar.zzj, this.zzj) == 0 && Double.compare(zzgukVar.zzk, this.zzk) == 0 && Double.compare(zzgukVar.zzl, this.zzl) == 0 && Double.compare(zzgukVar.zzm, this.zzm) == 0 && Double.compare(zzgukVar.zze, this.zze) == 0 && Double.compare(zzgukVar.zzf, this.zzf) == 0 && Double.compare(zzgukVar.zzg, this.zzg) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zze);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zzf);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zzg);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.zzh);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.zzi);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.zzj);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.zzk);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.zzl);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.zzm);
        return (((((((((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31) + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4))) * 31) + ((int) ((jDoubleToLongBits5 >>> 32) ^ jDoubleToLongBits5))) * 31) + ((int) ((jDoubleToLongBits6 >>> 32) ^ jDoubleToLongBits6))) * 31) + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7))) * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public final String toString() {
        if (equals(zza)) {
            return "Rotate 0°";
        }
        if (equals(zzb)) {
            return "Rotate 90°";
        }
        if (equals(zzc)) {
            return "Rotate 180°";
        }
        if (equals(zzd)) {
            return "Rotate 270°";
        }
        double d = this.zze;
        double d2 = this.zzf;
        double d3 = this.zzg;
        double d4 = this.zzh;
        double d5 = this.zzi;
        double d6 = this.zzj;
        double d7 = this.zzk;
        double d8 = this.zzl;
        double d9 = this.zzm;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
