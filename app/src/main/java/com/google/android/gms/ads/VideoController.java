package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.internal.ads.zzcgn;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    public final Object a = new Object();

    @GuardedBy("lock")
    public zzdk b;

    @GuardedBy("lock")
    public VideoLifecycleCallbacks c;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public int getPlaybackState() {
        synchronized (this.a) {
            zzdk zzdkVar = this.b;
            if (zzdkVar == null) {
                return 0;
            }
            try {
                return zzdkVar.zzh();
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.a) {
            videoLifecycleCallbacks = this.c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.a) {
            z = this.b != null;
        }
        return z;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.a) {
            zzdk zzdkVar = this.b;
            if (zzdkVar == null) {
                return false;
            }
            try {
                return zzdkVar.zzo();
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.a) {
            zzdk zzdkVar = this.b;
            if (zzdkVar == null) {
                return false;
            }
            try {
                return zzdkVar.zzp();
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.a) {
            zzdk zzdkVar = this.b;
            if (zzdkVar == null) {
                return true;
            }
            try {
                return zzdkVar.zzq();
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.a) {
            zzdk zzdkVar = this.b;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzj(z);
                } catch (RemoteException e) {
                    zzcgn.zzh("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.a) {
            zzdk zzdkVar = this.b;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzk();
                } catch (RemoteException e) {
                    zzcgn.zzh("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public void play() {
        synchronized (this.a) {
            zzdk zzdkVar = this.b;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzl();
                } catch (RemoteException e) {
                    zzcgn.zzh("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfe zzfeVar;
        synchronized (this.a) {
            this.c = videoLifecycleCallbacks;
            zzdk zzdkVar = this.b;
            if (zzdkVar != null) {
                if (videoLifecycleCallbacks == null) {
                    zzfeVar = null;
                } else {
                    try {
                        zzfeVar = new zzfe(videoLifecycleCallbacks);
                    } catch (RemoteException e) {
                        zzcgn.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                    }
                }
                zzdkVar.zzm(zzfeVar);
            }
        }
    }

    public void stop() {
        synchronized (this.a) {
            zzdk zzdkVar = this.b;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzn();
                } catch (RemoteException e) {
                    zzcgn.zzh("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public final zzdk zza() {
        zzdk zzdkVar;
        synchronized (this.a) {
            zzdkVar = this.b;
        }
        return zzdkVar;
    }

    public final void zzb(zzdk zzdkVar) {
        synchronized (this.a) {
            this.b = zzdkVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.c;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}
