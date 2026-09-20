package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import defpackage.jz2;
import defpackage.li;
import defpackage.sh5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MediaControllerCompat$MediaControllerImplApi21 {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final HashMap<MediaControllerCompat$Callback, ExtraCallback> c = new HashMap<>();
    public final MediaSessionCompat.Token d;

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
        public final WeakReference<MediaControllerCompat$MediaControllerImplApi21> w;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super(null);
            this.w = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.w.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
                MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.d;
                IMediaSession iMediaSessionK0 = IMediaSession.Stub.K0(li.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                synchronized (token.w) {
                    token.y = iMediaSessionK0;
                }
                MediaSessionCompat.Token token2 = mediaControllerCompat$MediaControllerImplApi21.d;
                sh5 sh5VarB = jz2.b(bundle);
                synchronized (token2.w) {
                    token2.z = sh5VarB;
                }
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    public static class ExtraCallback extends MediaControllerCompat$Callback.StubCompat {
        public ExtraCallback(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
            super(mediaControllerCompat$Callback);
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public final void J0(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public final void Q() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public final void Y() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public final void a0(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public final void s0() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public final void v() {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        IMediaSession iMediaSession;
        this.d = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.x);
        synchronized (token.w) {
            iMediaSession = token.y;
        }
        if (iMediaSession == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    public final void a() {
        IMediaSession iMediaSession;
        IMediaSession iMediaSession2;
        MediaSessionCompat.Token token = this.d;
        synchronized (token.w) {
            iMediaSession = token.y;
        }
        if (iMediaSession == null) {
            return;
        }
        ArrayList<MediaControllerCompat$Callback> arrayList = this.b;
        for (MediaControllerCompat$Callback mediaControllerCompat$Callback : arrayList) {
            ExtraCallback extraCallback = new ExtraCallback(mediaControllerCompat$Callback);
            this.c.put(mediaControllerCompat$Callback, extraCallback);
            mediaControllerCompat$Callback.a = extraCallback;
            try {
                synchronized (token.w) {
                    iMediaSession2 = token.y;
                }
                iMediaSession2.e(extraCallback);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }
}
