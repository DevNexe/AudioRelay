package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.bc2;
import defpackage.hc2;
import defpackage.jc2;
import defpackage.li;
import defpackage.sh5;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat {
    public static int c;
    public final MediaSessionImplApi21 a;
    public final ArrayList<YKK> b = new ArrayList<>();

    public interface CQf {
        QnHx a();

        PlaybackStateCompat b();

        void c(jc2 jc2Var);

        jc2 d();
    }

    public static class F1 extends MediaSessionImplApi21 {
        public F1(Context context) {
            super(context);
        }
    }

    public static class LPt8Fixed extends F1 {
        public LPt8Fixed(Context context) {
            super(context);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.CQf
        public final void c(jc2 jc2Var) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.CQf
        public final jc2 d() {
            return new jc2(this.a.getCurrentControllerInfo());
        }
    }

    public static class MediaSessionImplApi21 implements CQf {
        public final MediaSession a;
        public final Token b;
        public final Bundle d;
        public PlaybackStateCompat g;
        public MediaMetadataCompat h;
        public int i;
        public QnHx j;
        public jc2 k;
        public final Object c = new Object();
        public boolean e = false;
        public final RemoteCallbackList<IMediaControllerCallback> f = new RemoteCallbackList<>();

        public class ExtraSession extends IMediaSession.Stub {
            public ExtraSession() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void B(int i, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void C0(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final String D0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final CharSequence E() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void F(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void F0(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final MediaMetadataCompat G() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final Bundle H() {
                MediaSessionImplApi21 mediaSessionImplApi21 = MediaSessionImplApi21.this;
                if (mediaSessionImplApi21.d == null) {
                    return null;
                }
                return new Bundle(mediaSessionImplApi21.d);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void I(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21.this.f.unregister(iMediaControllerCallback);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (MediaSessionImplApi21.this.c) {
                    MediaSessionImplApi21.this.getClass();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void K(int i, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void M() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void N(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void R(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void S(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean U(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void X(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void Z(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PlaybackStateCompat b() {
                MediaSessionImplApi21 mediaSessionImplApi21 = MediaSessionImplApi21.this;
                return MediaSessionCompat.b(mediaSessionImplApi21.g, mediaSessionImplApi21.h);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final long c() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final String c0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void d0(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void e(IMediaControllerCallback iMediaControllerCallback) {
                if (MediaSessionImplApi21.this.e) {
                    return;
                }
                MediaSessionImplApi21.this.f.register(iMediaControllerCallback, new jc2("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (MediaSessionImplApi21.this.c) {
                    MediaSessionImplApi21.this.getClass();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void h() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void i(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void j(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void j0() {
                MediaSessionImplApi21.this.getClass();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void k(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void k0(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void l0() {
                MediaSessionImplApi21.this.getClass();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void n(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void n0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean o() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void o0(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void p() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void p0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void q(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void q0() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void r0(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PendingIntent t() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void t0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void u0(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void w() {
                MediaSessionImplApi21.this.getClass();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int x0() {
                return MediaSessionImplApi21.this.i;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void y0(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void z() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final ParcelableVolumeInfo z0() {
                throw new AssertionError();
            }
        }

        public MediaSessionImplApi21(Context context) {
            MediaSession mediaSessionE = e(context);
            this.a = mediaSessionE;
            this.b = new Token(mediaSessionE.getSessionToken(), new ExtraSession(), null);
            this.d = null;
            mediaSessionE.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.CQf
        public final QnHx a() {
            QnHx qnHx;
            synchronized (this.c) {
                qnHx = this.j;
            }
            return qnHx;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.CQf
        public final PlaybackStateCompat b() {
            return this.g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.CQf
        public void c(jc2 jc2Var) {
            synchronized (this.c) {
                this.k = jc2Var;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.CQf
        public jc2 d() {
            jc2 jc2Var;
            synchronized (this.c) {
                jc2Var = this.k;
            }
            return jc2Var;
        }

        public MediaSession e(Context context) {
            return new MediaSession(context, "audiorelay_session");
        }

        public final String f() {
            MediaSession mediaSession = this.a;
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }
    }

    public static class NUlFixed extends LPt8Fixed {
        public NUlFixed(Context context) {
            super(context);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21
        public final MediaSession e(Context context) {
            return new MediaSession(context, "audiorelay_session", null);
        }
    }

    public static abstract class QnHx {
        public boolean c;
        public HandlerC0015QnHx e;
        public final Object a = new Object();
        public final CQf b = new CQf();
        public WeakReference<CQf> d = new WeakReference<>(null);

        public class CQf extends MediaSession.Callback {
            public CQf() {
            }

            public static void b(MediaSessionImplApi21 mediaSessionImplApi21) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strF = mediaSessionImplApi21.f();
                if (TextUtils.isEmpty(strF)) {
                    strF = "android.media.session.MediaController";
                }
                mediaSessionImplApi21.c(new jc2(strF, -1, -1));
            }

            public final MediaSessionImplApi21 a() {
                MediaSessionImplApi21 mediaSessionImplApi21;
                synchronized (QnHx.this.a) {
                    mediaSessionImplApi21 = (MediaSessionImplApi21) QnHx.this.d.get();
                }
                if (mediaSessionImplApi21 == null || QnHx.this != mediaSessionImplApi21.a()) {
                    return null;
                }
                return mediaSessionImplApi21;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                IMediaSession iMediaSession;
                sh5 sh5Var;
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(mediaSessionImplApi21A);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = mediaSessionImplApi21A.b;
                        synchronized (token.w) {
                            iMediaSession = token.y;
                        }
                        li.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iMediaSession == null ? null : iMediaSession.asBinder());
                        synchronized (token.w) {
                            sh5Var = token.z;
                        }
                        if (sh5Var != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(sh5Var));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else {
                        boolean zEquals = str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM");
                        QnHx qnHx = QnHx.this;
                        if (zEquals) {
                            qnHx.getClass();
                        } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                            bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                            qnHx.getClass();
                        } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            qnHx.getClass();
                        } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            qnHx.getClass();
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCustomAction(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(mediaSessionImplApi21A);
                try {
                    boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
                    QnHx qnHx = QnHx.this;
                    if (zEquals) {
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        qnHx.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        qnHx.getClass();
                    } else {
                        qnHx.getClass();
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onFastForward() {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final boolean onMediaButtonEvent(Intent intent) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return false;
                }
                b(mediaSessionImplApi21A);
                boolean zA = QnHx.this.a(intent);
                mediaSessionImplApi21A.c(null);
                return zA || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPause() {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlay() {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepare() {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onRewind() {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSeekTo(long j) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetPlaybackSpeed(float f) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetRating(Rating rating) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                RatingCompat.a(rating);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToNext() {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToPrevious() {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToQueueItem(long j) {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onStop() {
                MediaSessionImplApi21 mediaSessionImplApi21A = a();
                if (mediaSessionImplApi21A == null) {
                    return;
                }
                b(mediaSessionImplApi21A);
                QnHx.this.getClass();
                mediaSessionImplApi21A.c(null);
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$QnHx$QnHx, reason: collision with other inner class name */
        public class HandlerC0015QnHx extends Handler {
            public HandlerC0015QnHx(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                CQf cQf;
                QnHx qnHx;
                HandlerC0015QnHx handlerC0015QnHx;
                if (message.what == 1) {
                    synchronized (QnHx.this.a) {
                        cQf = QnHx.this.d.get();
                        qnHx = QnHx.this;
                        handlerC0015QnHx = qnHx.e;
                    }
                    if (cQf == null || qnHx != cQf.a() || handlerC0015QnHx == null) {
                        return;
                    }
                    cQf.c((jc2) message.obj);
                    QnHx qnHx2 = QnHx.this;
                    if (qnHx2.c) {
                        qnHx2.c = false;
                        handlerC0015QnHx.removeMessages(1);
                        cQf.b();
                    }
                    cQf.c(null);
                }
            }
        }

        public final boolean a(Intent intent) {
            CQf cQf;
            HandlerC0015QnHx handlerC0015QnHx;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.a) {
                cQf = this.d.get();
                handlerC0015QnHx = this.e;
            }
            if (cQf == null || handlerC0015QnHx == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            jc2 jc2VarD = cQf.d();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                if (this.c) {
                    this.c = false;
                    handlerC0015QnHx.removeMessages(1);
                    cQf.b();
                }
                return false;
            }
            if (keyEvent.getRepeatCount() == 0) {
                if (this.c) {
                    handlerC0015QnHx.removeMessages(1);
                    this.c = false;
                    cQf.b();
                } else {
                    this.c = true;
                    handlerC0015QnHx.sendMessageDelayed(handlerC0015QnHx.obtainMessage(1, jc2VarD), ViewConfiguration.getDoubleTapTimeout());
                }
            } else if (this.c) {
                this.c = false;
                handlerC0015QnHx.removeMessages(1);
                cQf.b();
            }
            return true;
        }

        public final void b(CQf cQf, Handler handler) {
            synchronized (this.a) {
                this.d = new WeakReference<>(cQf);
                HandlerC0015QnHx handlerC0015QnHx = this.e;
                HandlerC0015QnHx handlerC0015QnHx2 = null;
                if (handlerC0015QnHx != null) {
                    handlerC0015QnHx.removeCallbacksAndMessages(null);
                }
                if (cQf != null && handler != null) {
                    handlerC0015QnHx2 = new HandlerC0015QnHx(handler.getLooper());
                }
                this.e = handlerC0015QnHx2;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new QnHx();
        public final ResultReceiver w;

        public class QnHx implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.w = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.w.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new QnHx();
        public final Object w = new Object();
        public final Object x;
        public IMediaSession y;
        public sh5 z;

        public class QnHx implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj, IMediaSession iMediaSession, sh5 sh5Var) {
            this.x = obj;
            this.y = iMediaSession;
            this.z = sh5Var;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.w) {
                IMediaSession iMediaSession = this.y;
                if (iMediaSession != null) {
                    li.b(bundle, "android.support.v4.media.session.EXTRA_BINDER", iMediaSession.asBinder());
                }
                sh5 sh5Var = this.z;
                if (sh5Var != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("a", new ParcelImpl(sh5Var));
                    bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.x;
            if (obj2 == null) {
                return token.x == null;
            }
            Object obj3 = token.x;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.x;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.x, i);
        }
    }

    public interface YKK {
        void a();
    }

    public MediaSessionCompat(Context context) {
        ComponentName componentName;
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty("audiorelay_session")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i = bc2.a;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        PendingIntent broadcast = null;
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (listQueryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = null;
        }
        if (componentName == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = new NUlFixed(context);
        } else if (i2 >= 28) {
            this.a = new LPt8Fixed(context);
        } else if (i2 >= 22) {
            this.a = new F1(context);
        } else {
            this.a = new MediaSessionImplApi21(context);
        }
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        android.support.v4.media.session.CQf cQf = new android.support.v4.media.session.CQf();
        MediaSessionImplApi21 mediaSessionImplApi21 = this.a;
        synchronized (mediaSessionImplApi21.c) {
            mediaSessionImplApi21.j = cQf;
            mediaSessionImplApi21.a.setCallback(cQf.b, handler);
            cQf.b(mediaSessionImplApi21, handler);
        }
        this.a.a.setMediaButtonReceiver(broadcast);
        new ConcurrentHashMap();
        Token token = this.a.b;
        if (i2 >= 29) {
            new android.support.v4.media.session.QnHx(context, token);
        } else {
            new MediaControllerCompat$MediaControllerImplApi21(context, token);
        }
        if (c == 0) {
            c = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        long j3 = playbackStateCompat.x;
        if (j3 == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.w;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        long j4 = playbackStateCompat.D;
        if (j4 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = ((long) (playbackStateCompat.z * (jElapsedRealtime - j4))) + j3;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.w;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j2 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j2 < 0 || j5 <= j2) {
            j = j5 < 0 ? 0L : j5;
        } else {
            j = j2;
        }
        ArrayList arrayList = new ArrayList();
        long j6 = playbackStateCompat.y;
        long j7 = playbackStateCompat.A;
        int i2 = playbackStateCompat.B;
        CharSequence charSequence = playbackStateCompat.C;
        ArrayList arrayList2 = playbackStateCompat.E;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.w, j, j6, playbackStateCompat.z, j7, i2, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.F, playbackStateCompat.G);
    }

    public static Bundle e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public final void c(MediaMetadataCompat mediaMetadataCompat) {
        MediaSessionImplApi21 mediaSessionImplApi21 = this.a;
        mediaSessionImplApi21.h = mediaMetadataCompat;
        if (mediaMetadataCompat.x == null) {
            Parcel parcelObtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompat.x = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        mediaSessionImplApi21.a.setMetadata(mediaMetadataCompat.x);
    }

    public final void d(PlaybackStateCompat playbackStateCompat) {
        MediaSessionImplApi21 mediaSessionImplApi21 = this.a;
        mediaSessionImplApi21.g = playbackStateCompat;
        synchronized (mediaSessionImplApi21.c) {
            int iBeginBroadcast = mediaSessionImplApi21.f.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast < 0) {
                    break;
                } else {
                    try {
                        ((IMediaControllerCallback) mediaSessionImplApi21.f.getBroadcastItem(iBeginBroadcast)).G0(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
            }
            mediaSessionImplApi21.f.finishBroadcast();
        }
        MediaSession mediaSession = mediaSessionImplApi21.a;
        if (playbackStateCompat.H == null) {
            PlaybackState.Builder builderD = PlaybackStateCompat.CQf.d();
            PlaybackStateCompat.CQf.x(builderD, playbackStateCompat.w, playbackStateCompat.x, playbackStateCompat.z, playbackStateCompat.D);
            PlaybackStateCompat.CQf.u(builderD, playbackStateCompat.y);
            PlaybackStateCompat.CQf.s(builderD, playbackStateCompat.A);
            PlaybackStateCompat.CQf.v(builderD, playbackStateCompat.C);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.E) {
                PlaybackState.CustomAction customActionB = customAction.A;
                if (customActionB == null) {
                    PlaybackState.CustomAction.Builder builderE = PlaybackStateCompat.CQf.e(customAction.w, customAction.x, customAction.y);
                    PlaybackStateCompat.CQf.w(builderE, customAction.z);
                    customActionB = PlaybackStateCompat.CQf.b(builderE);
                }
                PlaybackStateCompat.CQf.a(builderD, customActionB);
            }
            PlaybackStateCompat.CQf.t(builderD, playbackStateCompat.F);
            if (Build.VERSION.SDK_INT >= 22) {
                PlaybackStateCompat.F1.b(builderD, playbackStateCompat.G);
            }
            playbackStateCompat.H = PlaybackStateCompat.CQf.c(builderD);
        }
        mediaSession.setPlaybackState(playbackStateCompat.H);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new QnHx();
        public final MediaDescriptionCompat w;
        public final long x;

        public static class CQf {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public class QnHx implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.w = mediaDescriptionCompat;
            this.x = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.w);
            sb.append(", Id=");
            return hc2.a(sb, this.x, " }");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.w.writeToParcel(parcel, i);
            parcel.writeLong(this.x);
        }

        public QueueItem(Parcel parcel) {
            this.w = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.x = parcel.readLong();
        }
    }
}
