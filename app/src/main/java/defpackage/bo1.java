package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class bo1 {
    public final F1 a;

    public static final class CQf implements F1 {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public CQf(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // bo1.F1
        public final Uri a() {
            return this.a;
        }

        @Override // bo1.F1
        public final void b() {
        }

        @Override // bo1.F1
        public final Uri c() {
            return this.c;
        }

        @Override // bo1.F1
        public final Object d() {
            return null;
        }

        @Override // bo1.F1
        public final ClipDescription getDescription() {
            return this.b;
        }
    }

    public interface F1 {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public bo1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new QnHx(uri, clipDescription, uri2);
        } else {
            this.a = new CQf(uri, clipDescription, uri2);
        }
    }

    public static final class QnHx implements F1 {
        public final InputContentInfo a;

        public QnHx(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // bo1.F1
        public final Uri a() {
            return this.a.getContentUri();
        }

        @Override // bo1.F1
        public final void b() {
            this.a.requestPermission();
        }

        @Override // bo1.F1
        public final Uri c() {
            return this.a.getLinkUri();
        }

        @Override // bo1.F1
        public final Object d() {
            return this.a;
        }

        @Override // bo1.F1
        public final ClipDescription getDescription() {
            return this.a.getDescription();
        }

        public QnHx(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public bo1(QnHx qnHx) {
        this.a = qnHx;
    }
}
