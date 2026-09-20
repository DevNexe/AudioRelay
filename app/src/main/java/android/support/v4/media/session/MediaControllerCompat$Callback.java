package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import defpackage.Bt7j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaControllerCompat$Callback implements IBinder.DeathRecipient {
    public IMediaControllerCallback a;

    public static class QnHx extends MediaController.Callback {
        public final WeakReference<MediaControllerCompat$Callback> a;

        public QnHx(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
            this.a = new WeakReference<>(mediaControllerCompat$Callback);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            if (this.a.get() != null) {
                playbackInfo.getPlaybackType();
                playbackInfo.getAudioAttributes();
                if (Build.VERSION.SDK_INT >= 26) {
                }
                playbackInfo.getVolumeControl();
                playbackInfo.getMaxVolume();
                playbackInfo.getCurrentVolume();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            if (this.a.get() != null) {
                Bt7j<String, Integer> bt7j = MediaMetadataCompat.y;
                if (mediaMetadata != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaMetadata.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    MediaMetadataCompat mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                    mediaMetadataCompatCreateFromParcel.x = mediaMetadata;
                }
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            ArrayList arrayList;
            PlaybackStateCompat.CustomAction customAction;
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.a.get();
            if (mediaControllerCompat$Callback == null || mediaControllerCompat$Callback.a != null || playbackState == null) {
                return;
            }
            List<PlaybackState.CustomAction> listJ = PlaybackStateCompat.CQf.j(playbackState);
            Bundle bundleA = null;
            if (listJ != null) {
                ArrayList arrayList2 = new ArrayList(listJ.size());
                for (PlaybackState.CustomAction customAction2 : listJ) {
                    if (customAction2 != null) {
                        PlaybackState.CustomAction customAction3 = customAction2;
                        Bundle bundleL = PlaybackStateCompat.CQf.l(customAction3);
                        MediaSessionCompat.a(bundleL);
                        customAction = new PlaybackStateCompat.CustomAction(PlaybackStateCompat.CQf.f(customAction3), PlaybackStateCompat.CQf.o(customAction3), PlaybackStateCompat.CQf.m(customAction3), bundleL);
                        customAction.A = customAction3;
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (Build.VERSION.SDK_INT >= 22) {
                bundleA = PlaybackStateCompat.F1.a(playbackState);
                MediaSessionCompat.a(bundleA);
            }
            new PlaybackStateCompat(PlaybackStateCompat.CQf.r(playbackState), PlaybackStateCompat.CQf.q(playbackState), PlaybackStateCompat.CQf.i(playbackState), PlaybackStateCompat.CQf.p(playbackState), PlaybackStateCompat.CQf.g(playbackState), 0, PlaybackStateCompat.CQf.k(playbackState), PlaybackStateCompat.CQf.n(playbackState), arrayList, PlaybackStateCompat.CQf.h(playbackState), bundleA).H = playbackState;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueChanged(List<MediaSession.QueueItem> list) {
            MediaSessionCompat.QueueItem queueItem;
            if (this.a.get() == null || list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (MediaSession.QueueItem queueItem2 : list) {
                if (queueItem2 != null) {
                    MediaSession.QueueItem queueItem3 = queueItem2;
                    queueItem = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.a(MediaSessionCompat.QueueItem.CQf.b(queueItem3)), MediaSessionCompat.QueueItem.CQf.c(queueItem3));
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionDestroyed() {
            this.a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.a.get();
        }
    }

    public static class StubCompat extends IMediaControllerCallback.Stub {
        public final WeakReference<MediaControllerCompat$Callback> x;

        public StubCompat(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
            this.x = new WeakReference<>(mediaControllerCompat$Callback);
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public final void G0(PlaybackStateCompat playbackStateCompat) {
            this.x.get();
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public final void g0(int i) {
            this.x.get();
        }
    }

    public MediaControllerCompat$Callback() {
        new QnHx(this);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}
