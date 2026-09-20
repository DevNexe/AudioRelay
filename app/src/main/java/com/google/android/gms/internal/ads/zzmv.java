package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent$Builder;
import android.media.metrics.PlaybackErrorEvent$Builder;
import android.media.metrics.PlaybackMetrics$Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent$Builder;
import android.media.metrics.TrackChangeEvent$Builder;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import defpackage.vh1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmv implements zzkp, zzmw {
    public String E;
    public PlaybackMetrics$Builder F;
    public int G;
    public zzbw J;
    public vh1 K;
    public vh1 L;
    public vh1 M;
    public zzaf N;
    public zzaf O;
    public zzaf P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public final Context w;
    public final zzmt x;
    public final PlaybackSession y;
    public final zzcm A = new zzcm();
    public final zzck B = new zzck();
    public final HashMap D = new HashMap();
    public final HashMap C = new HashMap();
    public final long z = SystemClock.elapsedRealtime();
    public int H = 0;
    public int I = 0;

    public zzmv(Context context, PlaybackSession playbackSession) {
        this.w = context.getApplicationContext();
        this.y = playbackSession;
        zzmt zzmtVar = new zzmt(zzmt.zza);
        this.x = zzmtVar;
        zzmtVar.zzg(this);
    }

    @SuppressLint({"SwitchIntDef"})
    public static int a(int i) {
        switch (zzel.zzl(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static zzmv zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmv(context, mediaMetricsManager.createPlaybackSession());
    }

    public final void b() {
        PlaybackMetrics$Builder playbackMetrics$Builder = this.F;
        if (playbackMetrics$Builder != null && this.V) {
            playbackMetrics$Builder.setAudioUnderrunCount(this.U);
            this.F.setVideoFramesDropped(this.S);
            this.F.setVideoFramesPlayed(this.T);
            Long l = (Long) this.C.get(this.E);
            this.F.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.D.get(this.E);
            this.F.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.F.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.y.reportPlaybackMetrics(this.F.build());
        }
        this.F = null;
        this.E = null;
        this.U = 0;
        this.S = 0;
        this.T = 0;
        this.N = null;
        this.O = null;
        this.P = null;
        this.V = false;
    }

    @RequiresNonNull({"metricsBuilder"})
    public final void c(zzcn zzcnVar, zzsg zzsgVar) {
        int iZza;
        PlaybackMetrics$Builder playbackMetrics$Builder = this.F;
        if (zzsgVar == null || (iZza = zzcnVar.zza(zzsgVar.zza)) == -1) {
            return;
        }
        zzck zzckVar = this.B;
        int i = 0;
        zzcnVar.zzd(iZza, zzckVar, false);
        int i2 = zzckVar.zzd;
        zzcm zzcmVar = this.A;
        zzcnVar.zze(i2, zzcmVar, 0L);
        zzay zzayVar = zzcmVar.zzd.zzd;
        if (zzayVar != null) {
            int iZzp = zzel.zzp(zzayVar.zza);
            if (iZzp == 0) {
                i = 3;
            } else if (iZzp != 1) {
                i = iZzp != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        playbackMetrics$Builder.setStreamType(i);
        if (zzcmVar.zzn != -9223372036854775807L && !zzcmVar.zzl && !zzcmVar.zzi && !zzcmVar.zzb()) {
            playbackMetrics$Builder.setMediaDurationMillis(zzel.zzz(zzcmVar.zzn));
        }
        playbackMetrics$Builder.setPlaybackType(true != zzcmVar.zzb() ? 1 : 2);
        this.V = true;
    }

    public final void d(int i, long j, zzaf zzafVar, int i2) {
        TrackChangeEvent$Builder timeSinceCreatedMillis = new TrackChangeEvent$Builder(i).setTimeSinceCreatedMillis(j - this.z);
        if (zzafVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzafVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzafVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzafVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzafVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzafVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzafVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzafVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzafVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzafVar.zzd;
            if (str4 != null) {
                String[] strArrZzag = zzel.zzag(str4, "-");
                Pair pairCreate = Pair.create(strArrZzag[0], strArrZzag.length >= 2 ? strArrZzag[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzafVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.V = true;
        this.y.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean e(vh1 vh1Var) {
        return vh1Var != null && ((String) vh1Var.c).equals(this.x.zzd());
    }

    public final LogSessionId zza() {
        return this.y.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final void zzc(zzkn zzknVar, String str) {
        zzsg zzsgVar = zzknVar.zzd;
        if (zzsgVar == null || !zzsgVar.zzb()) {
            b();
            this.E = str;
            this.F = new PlaybackMetrics$Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta01");
            c(zzknVar.zzb, zzknVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final void zzd(zzkn zzknVar, String str, boolean z) {
        zzsg zzsgVar = zzknVar.zzd;
        if ((zzsgVar == null || !zzsgVar.zzb()) && str.equals(this.E)) {
            b();
        }
        this.C.remove(str);
        this.D.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zze(zzkn zzknVar, zzaf zzafVar, zzgr zzgrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzf(zzkn zzknVar, int i, long j, long j2) {
        zzsg zzsgVar = zzknVar.zzd;
        if (zzsgVar != null) {
            String strZze = this.x.zze(zzknVar.zzb, zzsgVar);
            HashMap map = this.D;
            Long l = (Long) map.get(strZze);
            HashMap map2 = this.C;
            Long l2 = (Long) map2.get(strZze);
            map.put(strZze, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strZze, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzkn zzknVar, zzsc zzscVar) {
        zzsg zzsgVar = zzknVar.zzd;
        if (zzsgVar == null) {
            return;
        }
        zzaf zzafVar = zzscVar.zzb;
        zzafVar.getClass();
        vh1 vh1Var = new vh1(zzafVar, this.x.zze(zzknVar.zzb, zzsgVar));
        int i = zzscVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.L = vh1Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.M = vh1Var;
                return;
            }
        }
        this.K = vh1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzh(zzkn zzknVar, int i, long j) {
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:267:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:269:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:270:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:272:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:275:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:286:0x0416  */
    /* JADX WARN: Code duplicated, block: B:287:0x0418 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:288:0x041a  */
    /* JADX WARN: Code duplicated, block: B:290:0x0420  */
    /* JADX WARN: Code duplicated, block: B:291:0x0422  */
    /* JADX WARN: Code duplicated, block: B:293:0x0428  */
    /* JADX WARN: Code duplicated, block: B:294:0x042b  */
    /* JADX WARN: Code duplicated, block: B:295:0x042d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0436  */
    /* JADX WARN: Code duplicated, block: B:302:0x043c  */
    /* JADX WARN: Code duplicated, block: B:305:0x045f  */
    /* JADX WARN: Code duplicated, block: B:321:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzi(zzcg zzcgVar, zzko zzkoVar) {
        zzmt zzmtVar;
        int i;
        int i2;
        PlaybackSession playbackSession;
        boolean z;
        boolean z2;
        int iZzh;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int errorCode;
        int iA;
        zzx zzxVar;
        int i7;
        int i8;
        if (zzkoVar.zzb() != 0) {
            int i9 = 0;
            while (true) {
                int iZzb = zzkoVar.zzb();
                zzmtVar = this.x;
                if (i9 >= iZzb) {
                    break;
                }
                int iZza = zzkoVar.zza(i9);
                zzkn zzknVarZzc = zzkoVar.zzc(iZza);
                if (iZza == 0) {
                    zzmtVar.zzj(zzknVarZzc);
                } else if (iZza == 11) {
                    zzmtVar.zzi(zzknVarZzc, this.G);
                } else {
                    zzmtVar.zzh(zzknVarZzc);
                }
                i9++;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (zzkoVar.zzd(0)) {
                zzkn zzknVarZzc2 = zzkoVar.zzc(0);
                if (this.F != null) {
                    c(zzknVarZzc2.zzb, zzknVarZzc2.zzd);
                }
            }
            if (zzkoVar.zzd(2) && this.F != null) {
                zzfuv zzfuvVarZza = zzcgVar.zzo().zza();
                int size = zzfuvVarZza.size();
                int i10 = 0;
                loop1: while (true) {
                    if (i10 >= size) {
                        zzxVar = null;
                        break;
                    }
                    zzcx zzcxVar = (zzcx) zzfuvVarZza.get(i10);
                    int i11 = 0;
                    while (true) {
                        int i12 = zzcxVar.zzb;
                        i8 = i10 + 1;
                        if (i11 <= 0) {
                            if (zzcxVar.zzd(i11) && (zzxVar = zzcxVar.zzb(i11).zzp) != null) {
                                break loop1;
                            } else {
                                i11++;
                            }
                        }
                    }
                    i10 = i8;
                }
                if (zzxVar != null) {
                    PlaybackMetrics$Builder playbackMetrics$Builder = this.F;
                    int i13 = zzel.zza;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= zzxVar.zzb) {
                            i7 = 1;
                            break;
                        }
                        UUID uuid = zzxVar.zza(i14).zza;
                        if (uuid.equals(zzo.zzd)) {
                            i7 = 3;
                            break;
                        } else if (uuid.equals(zzo.zze)) {
                            i7 = 2;
                            break;
                        } else {
                            if (uuid.equals(zzo.zzc)) {
                                i7 = 6;
                                break;
                            }
                            i14++;
                        }
                    }
                    playbackMetrics$Builder.setDrmType(i7);
                }
            }
            if (zzkoVar.zzd(1011)) {
                this.U++;
            }
            zzbw zzbwVar = this.J;
            Context context = this.w;
            long j = this.z;
            PlaybackSession playbackSession2 = this.y;
            if (zzbwVar != null) {
                if (zzbwVar.zzb == 1001) {
                    i6 = 20;
                } else {
                    zzgy zzgyVar = (zzgy) zzbwVar;
                    int i15 = zzgyVar.zze;
                    int i16 = zzgyVar.zzi;
                    Throwable cause = zzbwVar.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        if (cause instanceof zzfq) {
                            errorCode = ((zzfq) cause).zzd;
                            i5 = 5;
                        } else if ((cause instanceof zzfp) || (cause instanceof zzbu)) {
                            i6 = 11;
                        } else {
                            boolean z4 = cause instanceof zzfo;
                            if (z4 || (cause instanceof zzfy)) {
                                if (zzeb.zzb(context).zza() == 1) {
                                    i6 = 3;
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        i6 = 6;
                                    } else if (cause2 instanceof SocketTimeoutException) {
                                        i6 = 7;
                                    } else {
                                        i6 = (z4 && ((zzfo) cause).zzc == 1) ? 4 : 8;
                                    }
                                }
                            } else if (zzbwVar.zzb == 1002) {
                                i6 = 21;
                            } else if (cause instanceof zzpg) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                int i17 = zzel.zza;
                                if (i17 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                    errorCode = zzel.zzm(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    iA = a(errorCode);
                                    i5 = iA;
                                } else if (i17 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                    i6 = 27;
                                } else if (cause3 instanceof NotProvisionedException) {
                                    i6 = 24;
                                } else if (cause3 instanceof DeniedByServerException) {
                                    i6 = 29;
                                } else if (cause3 instanceof zzpr) {
                                    i6 = 23;
                                } else {
                                    i6 = cause3 instanceof zzpe ? 28 : 30;
                                }
                            } else if ((cause instanceof zzfk) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                i6 = (zzel.zza >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                            } else {
                                i6 = 9;
                            }
                        }
                    } else if (i15 == 1 && (i16 == 0 || i16 == 1)) {
                        i6 = 35;
                    } else if (i15 == 1 && i16 == 3) {
                        i6 = 15;
                    } else if (i15 == 1 && i16 == 2) {
                        i6 = 23;
                    } else if (cause instanceof zzqn) {
                        errorCode = zzel.zzm(((zzqn) cause).zzd);
                        i5 = 13;
                    } else {
                        i5 = 14;
                        if (cause instanceof zzqk) {
                            errorCode = zzel.zzm(((zzqk) cause).zzb);
                        } else if (cause instanceof OutOfMemoryError) {
                            i6 = 14;
                        } else if (cause instanceof zzns) {
                            errorCode = ((zzns) cause).zza;
                            i5 = 17;
                        } else if (cause instanceof zznv) {
                            errorCode = ((zznv) cause).zza;
                            i5 = 18;
                        } else {
                            int i18 = zzel.zza;
                            if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iA = a(errorCode);
                                i5 = iA;
                            } else {
                                i6 = 22;
                            }
                        }
                    }
                    playbackSession2.reportPlaybackErrorEvent(new PlaybackErrorEvent$Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(i5).setSubErrorCode(errorCode).setException(zzbwVar).build());
                    this.V = true;
                    this.J = null;
                }
                i5 = i6;
                errorCode = 0;
                playbackSession2.reportPlaybackErrorEvent(new PlaybackErrorEvent$Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(i5).setSubErrorCode(errorCode).setException(zzbwVar).build());
                this.V = true;
                this.J = null;
            }
            if (zzkoVar.zzd(2)) {
                zzcy zzcyVarZzo = zzcgVar.zzo();
                boolean zZzb = zzcyVarZzo.zzb(2);
                boolean zZzb2 = zzcyVarZzo.zzb(1);
                boolean zZzb3 = zzcyVarZzo.zzb(3);
                if (zZzb || zZzb2) {
                    z3 = zZzb3;
                } else if (zZzb3) {
                    z3 = true;
                } else {
                    playbackSession2 = playbackSession2;
                    context = context;
                    i = 3;
                }
                if (zZzb || zzel.zzT(this.N, null)) {
                    i = 3;
                } else {
                    int i19 = this.N == null ? 1 : 0;
                    this.N = null;
                    i = 3;
                    d(1, jElapsedRealtime, null, i19);
                }
                if (!zZzb2 && !zzel.zzT(this.O, null)) {
                    int i20 = this.O == null ? 1 : 0;
                    this.O = null;
                    d(0, jElapsedRealtime, null, i20);
                }
                if (!z3 && !zzel.zzT(this.P, null)) {
                    int i21 = this.P == null ? 1 : 0;
                    this.P = null;
                    d(2, jElapsedRealtime, null, i21);
                }
            } else {
                playbackSession2 = playbackSession2;
                context = context;
                i = 3;
            }
            if (e(this.K)) {
                zzaf zzafVar = (zzaf) this.K.b;
                if (zzafVar.zzs != -1) {
                    if (!zzel.zzT(this.N, zzafVar)) {
                        int i22 = this.N == null ? 1 : 0;
                        this.N = zzafVar;
                        d(1, jElapsedRealtime, zzafVar, i22);
                    }
                    this.K = null;
                }
            }
            if (e(this.L)) {
                zzaf zzafVar2 = (zzaf) this.L.b;
                if (!zzel.zzT(this.O, zzafVar2)) {
                    int i23 = this.O == null ? 1 : 0;
                    this.O = zzafVar2;
                    d(0, jElapsedRealtime, zzafVar2, i23);
                }
                this.L = null;
            }
            if (e(this.M)) {
                zzaf zzafVar3 = (zzaf) this.M.b;
                if (!zzel.zzT(this.P, zzafVar3)) {
                    int i24 = this.P == null ? 1 : 0;
                    this.P = zzafVar3;
                    d(2, jElapsedRealtime, zzafVar3, i24);
                }
                this.M = null;
            }
            switch (zzeb.zzb(context).zza()) {
                case 0:
                    i2 = 0;
                    break;
                case 1:
                    i2 = 9;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                case 8:
                default:
                    i2 = 1;
                    break;
                case 7:
                    i2 = 3;
                    break;
                case 9:
                    i2 = 8;
                    break;
                case 10:
                    i2 = 7;
                    break;
            }
            if (i2 != this.I) {
                this.I = i2;
                playbackSession = playbackSession2;
                playbackSession.reportNetworkEvent(new NetworkEvent$Builder().setNetworkType(i2).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
            } else {
                playbackSession = playbackSession2;
            }
            if (zzcgVar.zzh() != 2) {
                z = false;
                this.Q = false;
            } else {
                z = false;
            }
            if (((zzkd) zzcgVar).zzw() != null) {
                if (zzkoVar.zzd(10)) {
                    z2 = true;
                    this.R = true;
                }
                iZzh = zzcgVar.zzh();
                if (this.Q) {
                    i3 = 5;
                } else if (this.R) {
                    i3 = 13;
                } else if (iZzh == 4) {
                    i3 = 11;
                } else if (iZzh == 2) {
                    i4 = this.H;
                    if (i4 != 0 || i4 == 2) {
                        i3 = 2;
                    } else if (zzcgVar.zzq()) {
                        i3 = zzcgVar.zzi() != 0 ? 10 : 6;
                    } else {
                        i3 = 7;
                    }
                } else if (iZzh == i) {
                    if (!zzcgVar.zzq()) {
                        i3 = 4;
                    } else if (zzcgVar.zzi() != 0) {
                        i3 = 9;
                    } else {
                        i3 = 3;
                    }
                } else if (iZzh == z2 || this.H == 0) {
                    i3 = this.H;
                } else {
                    i3 = 12;
                }
                if (this.H != i3) {
                    this.H = i3;
                    this.V = z2;
                    playbackSession.reportPlaybackStateEvent(new PlaybackStateEvent$Builder().setState(this.H).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
                }
                if (zzkoVar.zzd(1028)) {
                    zzmtVar.zzf(zzkoVar.zzc(1028));
                }
            }
            this.R = z;
            z2 = true;
            iZzh = zzcgVar.zzh();
            if (this.Q) {
                i3 = 5;
            } else if (this.R) {
                i3 = 13;
            } else if (iZzh == 4) {
                i3 = 11;
            } else if (iZzh == 2) {
                i4 = this.H;
                if (i4 != 0) {
                    i3 = 2;
                } else {
                    i3 = 2;
                }
            } else if (iZzh == i) {
                if (!zzcgVar.zzq()) {
                    i3 = 4;
                } else if (zzcgVar.zzi() != 0) {
                    i3 = 9;
                } else {
                    i3 = 3;
                }
            } else if (iZzh == z2) {
                i3 = this.H;
            } else {
                i3 = this.H;
            }
            if (this.H != i3) {
                this.H = i3;
                this.V = z2;
                playbackSession.reportPlaybackStateEvent(new PlaybackStateEvent$Builder().setState(this.H).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
            }
            if (zzkoVar.zzd(1028)) {
                zzmtVar.zzf(zzkoVar.zzc(1028));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzj(zzkn zzknVar, zzrx zzrxVar, zzsc zzscVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzk(zzkn zzknVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzl(zzkn zzknVar, zzbw zzbwVar) {
        this.J = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzm(zzkn zzknVar, zzcf zzcfVar, zzcf zzcfVar2, int i) {
        if (i == 1) {
            this.Q = true;
            i = 1;
        }
        this.G = i;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzn(zzkn zzknVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzo(zzkn zzknVar, zzgq zzgqVar) {
        this.S += zzgqVar.zzg;
        this.T += zzgqVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzp(zzkn zzknVar, zzaf zzafVar, zzgr zzgrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzq(zzkn zzknVar, zzda zzdaVar) {
        vh1 vh1Var = this.K;
        if (vh1Var != null) {
            zzaf zzafVar = (zzaf) vh1Var.b;
            if (zzafVar.zzs == -1) {
                zzad zzadVarZzb = zzafVar.zzb();
                zzadVarZzb.zzX(zzdaVar.zzc);
                zzadVarZzb.zzF(zzdaVar.zzd);
                this.K = new vh1(zzadVarZzb.zzY(), (String) vh1Var.c);
            }
        }
    }
}
