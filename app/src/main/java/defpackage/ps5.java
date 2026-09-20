package defpackage;

import android.util.Log;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzfrs;
import com.google.android.gms.internal.ads.zzfus;
import com.google.android.gms.internal.ads.zzfuv;

/* JADX INFO: loaded from: classes3.dex */
public final class ps5 implements hs5 {
    public final zzfuv a;
    public final int b;

    public ps5(int i, zzfuv zzfuvVar) {
        this.b = i;
        this.a = zzfuvVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ps5 b(int i, zzed zzedVar) {
        hs5 qs5Var;
        String str;
        String str2;
        hs5 qs5Var2;
        zzfus zzfusVar = new zzfus();
        int iZzd = zzedVar.zzd();
        int i2 = -2;
        while (zzedVar.zza() > 8) {
            int iZzg = zzedVar.zzg();
            int iZzc = zzedVar.zzc() + zzedVar.zzg();
            zzedVar.zzE(iZzc);
            if (iZzg != 1414744396) {
                switch (iZzg) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzedVar.zzG(4);
                            int iZzg2 = zzedVar.zzg();
                            int iZzg3 = zzedVar.zzg();
                            zzedVar.zzG(4);
                            int iZzg4 = zzedVar.zzg();
                            switch (iZzg4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                zzad zzadVar = new zzad();
                                zzadVar.zzX(iZzg2);
                                zzadVar.zzF(iZzg3);
                                zzadVar.zzS(str2);
                                qs5Var2 = new qs5(zzadVar.zzY());
                                qs5Var = qs5Var2;
                            } else {
                                bj0.b("Ignoring track with unsupported compression ", iZzg4, "StreamFormatChunk");
                            }
                        } else if (i2 == 1) {
                            int iZzi = zzedVar.zzi();
                            if (iZzi == 1) {
                                str = "audio/raw";
                            } else if (iZzi == 85) {
                                str = "audio/mpeg";
                            } else if (iZzi == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iZzi != 8192) {
                                str = iZzi != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str != null) {
                                int iZzi2 = zzedVar.zzi();
                                int iZzg5 = zzedVar.zzg();
                                zzedVar.zzG(6);
                                int iZzn = zzel.zzn(zzedVar.zzo());
                                int iZzi3 = zzedVar.zzi();
                                byte[] bArr = new byte[iZzi3];
                                zzedVar.zzB(bArr, 0, iZzi3);
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzS(str);
                                zzadVar2.zzw(iZzi2);
                                zzadVar2.zzT(iZzg5);
                                if ("audio/raw".equals(str) && iZzn != 0) {
                                    zzadVar2.zzN(iZzn);
                                }
                                if ("audio/mp4a-latm".equals(str) && iZzi3 > 0) {
                                    zzadVar2.zzI(zzfuv.zzp(bArr));
                                }
                                qs5Var = new qs5(zzadVar2.zzY());
                            } else {
                                bj0.b("Ignoring track with unsupported format tag ", iZzi, "StreamFormatChunk");
                            }
                        } else {
                            Log.w("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzel.zzO(i2)));
                        }
                        qs5Var = null;
                        break;
                    case 1751742049:
                        int iZzg6 = zzedVar.zzg();
                        zzedVar.zzG(8);
                        int iZzg7 = zzedVar.zzg();
                        int iZzg8 = zzedVar.zzg();
                        zzedVar.zzG(4);
                        zzedVar.zzg();
                        zzedVar.zzG(12);
                        qs5Var = new ms5(iZzg6, iZzg7, iZzg8);
                        break;
                    case 1752331379:
                        int iZzg9 = zzedVar.zzg();
                        zzedVar.zzG(12);
                        zzedVar.zzg();
                        int iZzg10 = zzedVar.zzg();
                        int iZzg11 = zzedVar.zzg();
                        zzedVar.zzG(4);
                        int iZzg12 = zzedVar.zzg();
                        int iZzg13 = zzedVar.zzg();
                        zzedVar.zzG(8);
                        qs5Var2 = new ns5(iZzg9, iZzg10, iZzg11, iZzg12, iZzg13);
                        qs5Var = qs5Var2;
                        break;
                    case 1852994675:
                        qs5Var = new rs5(zzedVar.zzx(zzedVar.zza(), zzfrs.zzc));
                        break;
                    default:
                        qs5Var = null;
                        break;
                }
            } else {
                qs5Var = b(zzedVar.zzg(), zzedVar);
            }
            if (qs5Var != null) {
                if (qs5Var.zza() == 1752331379) {
                    int i3 = ((ns5) qs5Var).a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        Log.w("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfusVar.zze(qs5Var);
            }
            zzedVar.zzF(iZzc);
            zzedVar.zzE(iZzd);
        }
        return new ps5(i, zzfusVar.zzg());
    }

    public final hs5 a(Class cls) {
        zzfuv zzfuvVar = this.a;
        int size = zzfuvVar.size();
        int i = 0;
        while (i < size) {
            hs5 hs5Var = (hs5) zzfuvVar.get(i);
            i++;
            if (hs5Var.getClass() == cls) {
                return hs5Var;
            }
        }
        return null;
    }

    @Override // defpackage.hs5
    public final int zza() {
        return this.b;
    }
}
