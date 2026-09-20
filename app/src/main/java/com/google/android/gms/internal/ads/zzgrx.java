package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgrx {
    public static final /* synthetic */ zzgrx[] x;
    public static final zzgrx zza;
    public static final zzgrx zzb;
    public static final zzgrx zzc;
    public static final zzgrx zzd;
    public static final zzgrx zze;
    public static final zzgrx zzf;
    public static final zzgrx zzg;
    public static final zzgrx zzh;
    public static final zzgrx zzi;
    public static final zzgrx zzj;
    public static final zzgrx zzk;
    public static final zzgrx zzl;
    public static final zzgrx zzm;
    public static final zzgrx zzn;
    public static final zzgrx zzo;
    public static final zzgrx zzp;
    public static final zzgrx zzq;
    public static final zzgrx zzr;
    public final zzgry w;

    static {
        zzgrx zzgrxVar = new zzgrx("DOUBLE", 0, zzgry.zzd);
        zza = zzgrxVar;
        zzgrx zzgrxVar2 = new zzgrx("FLOAT", 1, zzgry.zzc);
        zzb = zzgrxVar2;
        zzgry zzgryVar = zzgry.zzb;
        zzgrx zzgrxVar3 = new zzgrx("INT64", 2, zzgryVar);
        zzc = zzgrxVar3;
        zzgrx zzgrxVar4 = new zzgrx("UINT64", 3, zzgryVar);
        zzd = zzgrxVar4;
        zzgry zzgryVar2 = zzgry.zza;
        zzgrx zzgrxVar5 = new zzgrx("INT32", 4, zzgryVar2);
        zze = zzgrxVar5;
        zzgrx zzgrxVar6 = new zzgrx("FIXED64", 5, zzgryVar);
        zzf = zzgrxVar6;
        zzgrx zzgrxVar7 = new zzgrx("FIXED32", 6, zzgryVar2);
        zzg = zzgrxVar7;
        zzgrx zzgrxVar8 = new zzgrx("BOOL", 7, zzgry.zze);
        zzh = zzgrxVar8;
        zzgrx zzgrxVar9 = new zzgrx("STRING", 8, zzgry.zzf);
        zzi = zzgrxVar9;
        zzgry zzgryVar3 = zzgry.zzi;
        zzgrx zzgrxVar10 = new zzgrx("GROUP", 9, zzgryVar3);
        zzj = zzgrxVar10;
        zzgrx zzgrxVar11 = new zzgrx("MESSAGE", 10, zzgryVar3);
        zzk = zzgrxVar11;
        zzgrx zzgrxVar12 = new zzgrx("BYTES", 11, zzgry.zzg);
        zzl = zzgrxVar12;
        zzgrx zzgrxVar13 = new zzgrx("UINT32", 12, zzgryVar2);
        zzm = zzgrxVar13;
        zzgrx zzgrxVar14 = new zzgrx("ENUM", 13, zzgry.zzh);
        zzn = zzgrxVar14;
        zzgrx zzgrxVar15 = new zzgrx("SFIXED32", 14, zzgryVar2);
        zzo = zzgrxVar15;
        zzgrx zzgrxVar16 = new zzgrx("SFIXED64", 15, zzgryVar);
        zzp = zzgrxVar16;
        zzgrx zzgrxVar17 = new zzgrx("SINT32", 16, zzgryVar2);
        zzq = zzgrxVar17;
        zzgrx zzgrxVar18 = new zzgrx("SINT64", 17, zzgryVar);
        zzr = zzgrxVar18;
        x = new zzgrx[]{zzgrxVar, zzgrxVar2, zzgrxVar3, zzgrxVar4, zzgrxVar5, zzgrxVar6, zzgrxVar7, zzgrxVar8, zzgrxVar9, zzgrxVar10, zzgrxVar11, zzgrxVar12, zzgrxVar13, zzgrxVar14, zzgrxVar15, zzgrxVar16, zzgrxVar17, zzgrxVar18};
    }

    public zzgrx(String str, int i, zzgry zzgryVar) {
        super(str, i);
        this.w = zzgryVar;
    }

    public static zzgrx[] values() {
        return (zzgrx[]) x.clone();
    }

    public final zzgry zza() {
        return this.w;
    }
}
