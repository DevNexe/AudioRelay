package com.google.android.gms.internal.ads;

import android.util.Log;
import defpackage.bt5;
import defpackage.ys5;
import defpackage.zs5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabt implements zzzf {
    public zzzi b;
    public int c;
    public int d;
    public int e;
    public zzadq g;
    public zzzg h;
    public zs5 i;
    public zzafn j;
    public final zzed a = new zzed(6);
    public long f = -1;

    public final int a(zzzg zzzgVar) {
        zzed zzedVar = this.a;
        zzedVar.zzC(2);
        ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, 2, false);
        return zzedVar.zzo();
    }

    public final void b() {
        c(new zzbp[0]);
        zzzi zzziVar = this.b;
        zzziVar.getClass();
        zzziVar.zzB();
        this.b.zzL(new zzaah(-9223372036854775807L, 0L));
        this.c = 6;
    }

    public final void c(zzbp... zzbpVarArr) {
        zzzi zzziVar = this.b;
        zzziVar.getClass();
        zzaam zzaamVarZzv = zzziVar.zzv(1024, 4);
        zzad zzadVar = new zzad();
        zzadVar.zzz("image/jpeg");
        zzadVar.zzM(new zzbq(zzbpVarArr));
        zzaamVarZzv.zzk(zzadVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws EOFException, InterruptedIOException {
        String strZzv;
        ys5 ys5Var;
        long j;
        int i = this.c;
        zzed zzedVar = this.a;
        if (i == 0) {
            zzedVar.zzC(2);
            ((zzyv) zzzgVar).zzn(zzedVar.zzH(), 0, 2, false);
            int iZzo = zzedVar.zzo();
            this.d = iZzo;
            if (iZzo == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    b();
                }
            } else if ((iZzo < 65488 || iZzo > 65497) && iZzo != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i == 1) {
            zzedVar.zzC(2);
            ((zzyv) zzzgVar).zzn(zzedVar.zzH(), 0, 2, false);
            this.e = zzedVar.zzo() - 2;
            this.c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || zzzgVar != this.h) {
                    this.h = zzzgVar;
                    this.i = new zs5(zzzgVar, this.f);
                }
                zzafn zzafnVar = this.j;
                zzafnVar.getClass();
                int iZza = zzafnVar.zza(this.i, zzaafVar);
                if (iZza == 1) {
                    zzaafVar.zza += this.f;
                }
                return iZza;
            }
            long jZzf = zzzgVar.zzf();
            long j2 = this.f;
            if (jZzf != j2) {
                zzaafVar.zza = j2;
                return 1;
            }
            if (zzzgVar.zzm(zzedVar.zzH(), 0, 1, true)) {
                zzzgVar.zzj();
                if (this.j == null) {
                    this.j = new zzafn(0);
                }
                zs5 zs5Var = new zs5(zzzgVar, this.f);
                this.i = zs5Var;
                if (this.j.zzd(zs5Var)) {
                    zzafn zzafnVar2 = this.j;
                    long j3 = this.f;
                    zzzi zzziVar = this.b;
                    zzziVar.getClass();
                    zzafnVar2.zzb(new zzaby(j3, zzziVar));
                    zzadq zzadqVar = this.g;
                    zzadqVar.getClass();
                    c(zzadqVar);
                    this.c = 5;
                } else {
                    b();
                }
            } else {
                b();
            }
            return 0;
        }
        if (this.d == 65505) {
            zzed zzedVar2 = new zzed(this.e);
            ((zzyv) zzzgVar).zzn(zzedVar2.zzH(), 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(zzedVar2.zzv((char) 0)) && (strZzv = zzedVar2.zzv((char) 0)) != null) {
                long jZzd = zzzgVar.zzd();
                zzadq zzadqVar2 = null;
                if (jZzd != -1) {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setInput(new StringReader(strZzv));
                        xmlPullParserNewPullParser.next();
                        if (!zzem.zzc(xmlPullParserNewPullParser, "x:xmpmeta")) {
                            throw zzbu.zza("Couldn't find xmp metadata", null);
                        }
                        zzfuv zzfuvVarZzo = zzfuv.zzo();
                        long j4 = -9223372036854775807L;
                        loop0: while (true) {
                            xmlPullParserNewPullParser.next();
                            if (zzem.zzc(xmlPullParserNewPullParser, "rdf:Description")) {
                                String[] strArr = bt5.a;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < 4) {
                                        String strZza = zzem.zza(xmlPullParserNewPullParser, strArr[i2]);
                                        if (strZza == null) {
                                            i2++;
                                        } else if (Integer.parseInt(strZza) == 1) {
                                            String[] strArr2 = bt5.b;
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 < 4) {
                                                    String strZza2 = zzem.zza(xmlPullParserNewPullParser, strArr2[i3]);
                                                    if (strZza2 != null) {
                                                        long j5 = Long.parseLong(strZza2);
                                                        if (j5 != -1) {
                                                            j4 = j5;
                                                            break;
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                                j4 = -9223372036854775807L;
                                                break;
                                            }
                                            String[] strArr3 = bt5.c;
                                            int i4 = 0;
                                            while (true) {
                                                if (i4 >= 2) {
                                                    zzfuvVarZzo = zzfuv.zzo();
                                                    break;
                                                }
                                                String strZza3 = zzem.zza(xmlPullParserNewPullParser, strArr3[i4]);
                                                if (strZza3 != null) {
                                                    zzfuvVarZzo = zzfuv.zzq(new zzabu("image/jpeg", "Primary", 0L, 0L), new zzabu("video/mp4", "MotionPhoto", Long.parseLong(strZza3), 0L));
                                                    break;
                                                }
                                                i4++;
                                            }
                                        }
                                    }
                                    ys5Var = null;
                                    break;
                                }
                            }
                            if (zzem.zzc(xmlPullParserNewPullParser, "Container:Directory")) {
                                zzfuvVarZzo = bt5.a(xmlPullParserNewPullParser, "Container", "Item");
                            } else if (zzem.zzc(xmlPullParserNewPullParser, "GContainer:Directory")) {
                                zzfuvVarZzo = bt5.a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                            }
                            long j6 = j4;
                            if (zzem.zzb(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                if (!zzfuvVarZzo.isEmpty()) {
                                    ys5Var = new ys5(j6, zzfuvVarZzo);
                                    break;
                                }
                                ys5Var = null;
                                break;
                            }
                            j4 = j6;
                        }
                        if (ys5Var != null && ((List) ys5Var.b).size() >= 2) {
                            long j7 = -1;
                            long j8 = -1;
                            long j9 = -1;
                            long j10 = -1;
                            boolean zEquals = false;
                            for (int size = ((List) ys5Var.b).size() - 1; size >= 0; size--) {
                                zzabu zzabuVar = (zzabu) ((List) ys5Var.b).get(size);
                                zEquals |= "video/mp4".equals(zzabuVar.zza);
                                if (size == 0) {
                                    jZzd -= zzabuVar.zzd;
                                    j = 0;
                                } else {
                                    j = jZzd - zzabuVar.zzc;
                                }
                                long j11 = j;
                                long j12 = jZzd;
                                jZzd = j11;
                                if (zEquals && jZzd != j12) {
                                    j10 = j12 - jZzd;
                                    j9 = jZzd;
                                    zEquals = false;
                                }
                                if (size == 0) {
                                    j8 = j12;
                                }
                                if (size == 0) {
                                    j7 = jZzd;
                                }
                            }
                            if (j9 != -1 && j10 != -1 && j7 != -1 && j8 != -1) {
                                zzadqVar2 = new zzadq(j7, j8, ys5Var.a, j9, j10);
                            }
                        }
                    } catch (zzbu | NumberFormatException | XmlPullParserException unused) {
                        Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                    }
                }
                this.g = zzadqVar2;
                if (zzadqVar2 != null) {
                    this.f = zzadqVar2.zzd;
                }
            }
        } else {
            ((zzyv) zzzgVar).zzo(this.e, false);
        }
        this.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.b = zzziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            zzafn zzafnVar = this.j;
            zzafnVar.getClass();
            zzafnVar.zzc(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        if (a(zzzgVar) != 65496) {
            return false;
        }
        int iA = a(zzzgVar);
        this.d = iA;
        zzed zzedVar = this.a;
        if (iA == 65504) {
            zzedVar.zzC(2);
            zzyv zzyvVar = (zzyv) zzzgVar;
            zzyvVar.zzm(zzedVar.zzH(), 0, 2, false);
            zzyvVar.zzl(zzedVar.zzo() - 2, false);
            iA = a(zzzgVar);
            this.d = iA;
        }
        if (iA == 65505) {
            zzyv zzyvVar2 = (zzyv) zzzgVar;
            zzyvVar2.zzl(2, false);
            zzedVar.zzC(6);
            zzyvVar2.zzm(zzedVar.zzH(), 0, 6, false);
            if (zzedVar.zzs() == 1165519206 && zzedVar.zzo() == 0) {
                return true;
            }
        }
        return false;
    }
}
