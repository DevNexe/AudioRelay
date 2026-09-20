package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import defpackage.dz5;
import defpackage.px5;
import defpackage.tb7;
import defpackage.x86;
import defpackage.y86;
import defpackage.z86;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcia extends zzcic implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final HashMap O;
    public final boolean A;
    public int B;
    public int C;
    public MediaPlayer D;
    public Uri E;
    public int F;
    public int G;
    public int H;
    public zzciu I;
    public final boolean J;
    public int K;
    public zzcib L;
    public boolean M;
    public Integer N;
    public final zzciw y;
    public final zzcix z;

    static {
        HashMap map = new HashMap();
        O = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcia(Context context, zzciw zzciwVar, boolean z, boolean z2, zzciv zzcivVar, zzcix zzcixVar) {
        super(context);
        this.B = 0;
        this.C = 0;
        this.M = false;
        this.N = null;
        setSurfaceTextureListener(this);
        this.y = zzciwVar;
        this.z = zzcixVar;
        this.J = z;
        this.A = z2;
        zzcixVar.zza(this);
    }

    public final void a() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.E == null || surfaceTexture == null) {
            return;
        }
        b(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzl();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.D = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.D.setOnCompletionListener(this);
            this.D.setOnErrorListener(this);
            this.D.setOnInfoListener(this);
            this.D.setOnPreparedListener(this);
            this.D.setOnVideoSizeChangedListener(this);
            this.H = 0;
            if (this.J) {
                zzciu zzciuVar = new zzciu(getContext());
                this.I = zzciuVar;
                zzciuVar.zzd(surfaceTexture, getWidth(), getHeight());
                this.I.start();
                SurfaceTexture surfaceTextureZzb = this.I.zzb();
                if (surfaceTextureZzb != null) {
                    surfaceTexture = surfaceTextureZzb;
                } else {
                    this.I.zze();
                    this.I = null;
                }
            }
            this.D.setDataSource(getContext(), this.E);
            com.google.android.gms.ads.internal.zzt.zzm();
            this.D.setSurface(new Surface(surfaceTexture));
            this.D.setAudioStreamType(3);
            this.D.setScreenOnWhilePlaying(true);
            this.D.prepareAsync();
            c(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            zzcgn.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.E)), e);
            onError(this.D, 1, 0);
        }
    }

    public final void b(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zze();
            this.I = null;
        }
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.D.release();
            this.D = null;
            c(0);
            if (z) {
                this.C = 0;
            }
        }
    }

    public final void c(int i) {
        zzcja zzcjaVar = this.x;
        zzcix zzcixVar = this.z;
        if (i == 3) {
            zzcixVar.zzc();
            zzcjaVar.zzb();
        } else if (this.B == 3) {
            zzcixVar.zze();
            zzcjaVar.zzc();
        }
        this.B = i;
    }

    public final boolean d() {
        int i;
        return (this.D == null || (i = this.B) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.H = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        c(5);
        this.C = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new x86(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        HashMap map = O;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        zzcgn.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        c(-1);
        this.C = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new px5(this, str, str2, 1, 0));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        HashMap map = O;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int defaultSize = View.getDefaultSize(this.F, i);
        int defaultSize2 = View.getDefaultSize(this.G, i2);
        if (this.F > 0 && this.G > 0 && this.I == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i6 = (this.G * size) / this.F;
                    if (mode2 == Integer.MIN_VALUE || i6 <= size2) {
                        defaultSize2 = i6;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.F * size2) / this.G;
                        if (mode != Integer.MIN_VALUE && i5 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i3 = this.F;
                        i4 = this.G;
                        if (mode2 == Integer.MIN_VALUE || i4 <= size2) {
                            i5 = i3;
                            size2 = i4;
                        } else {
                            i5 = (size2 * i3) / i4;
                        }
                        if (mode == Integer.MIN_VALUE && i5 > size) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i7 = this.F;
                int i8 = i7 * size2;
                int i9 = this.G;
                int i10 = size * i9;
                if (i8 < i10) {
                    defaultSize = i8 / i9;
                } else {
                    if (i8 > i10) {
                        defaultSize2 = i10 / i7;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i6 = (this.G * size) / this.F;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i6;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.F * size2) / this.G;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i3 = this.F;
                        i4 = this.G;
                        if (mode2 == Integer.MIN_VALUE) {
                            i5 = i3;
                            size2 = i4;
                        } else {
                            i5 = i3;
                            size2 = i4;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        c(2);
        this.z.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new tb7(this, mediaPlayer, 5));
        this.F = mediaPlayer.getVideoWidth();
        this.G = mediaPlayer.getVideoHeight();
        int i = this.K;
        if (i != 0) {
            zzq(i);
        }
        if (this.A && d() && this.D.getCurrentPosition() > 0 && this.C != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.D;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                zzcgn.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.D.start();
            int currentPosition = this.D.getCurrentPosition();
            long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
            while (d() && this.D.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzB().b() - jB <= 250) {
            }
            this.D.pause();
            zzn();
        }
        zzcgn.zzi("AdMediaPlayerView stream dimensions: " + this.F + " x " + this.G);
        if (this.C == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        a();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new y86(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null && this.K == 0) {
            this.K = mediaPlayer.getCurrentPosition();
        }
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zze();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new dz5(this, 3));
        b(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.C;
        boolean z = false;
        if (this.F == i && this.G == i2) {
            z = true;
        }
        if (this.D != null && i3 == 3 && z) {
            int i4 = this.K;
            if (i4 != 0) {
                zzq(i4);
            }
            zzp();
        }
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new z86(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.z.zzf(this);
        this.w.zza(surfaceTexture, this.L);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.F = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.G = videoHeight;
        if (this.F == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchr
            @Override // java.lang.Runnable
            public final void run() {
                zzcia zzciaVar = this.zza;
                int i2 = i;
                zzcib zzcibVar = zzciaVar.L;
                if (zzcibVar != null) {
                    zzcibVar.onWindowVisibilityChanged(i2);
                }
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final String toString() {
        return defpackage.LPt6Fixed.a(zzcia.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zza() {
        if (d()) {
            return this.D.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !d()) {
            return -1;
        }
        return this.D.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zzc() {
        if (d()) {
            return this.D.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zzd() {
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zze() {
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final long zzg() {
        if (this.N != null) {
            return (zzh() * ((long) this.H)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final long zzh() {
        if (this.N != null) {
            return ((long) zzc()) * ((long) this.N.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final String zzj() {
        return "MediaPlayer".concat(true != this.J ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcic, defpackage.g96
    public final void zzn() {
        float fZza = this.x.zza();
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer == null) {
            zzcgn.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(fZza, fZza);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (d() && this.D.isPlaying()) {
            this.D.pause();
            c(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new x86(this, 1));
        }
        this.C = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (d()) {
            this.D.start();
            c(3);
            this.w.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new y86(this, 1));
        }
        this.C = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView seek " + i);
        if (!d()) {
            this.K = i;
        } else {
            this.D.seekTo(i);
            this.K = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzr(zzcib zzcibVar) {
        this.L = zzcibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzs(String str) {
        Uri uri = Uri.parse(str);
        zzbdx zzbdxVarZza = zzbdx.zza(uri);
        if (zzbdxVarZza == null || zzbdxVarZza.zza != null) {
            if (zzbdxVarZza != null) {
                uri = Uri.parse(zzbdxVarZza.zza);
            }
            this.E = uri;
            this.K = 0;
            a();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.D.release();
            this.D = null;
            c(0);
            this.C = 0;
        }
        this.z.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzu(float f, float f2) {
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zzf(f, f2);
        }
    }
}
