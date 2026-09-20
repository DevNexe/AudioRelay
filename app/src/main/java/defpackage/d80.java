package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ContentInfo$Builder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d80 {
    public final NUlFixed a;

    public interface CQf {
        void a(Uri uri);

        void b(int i);

        d80 build();

        void setExtras(Bundle bundle);
    }

    public static final class F1 implements CQf {
        public final ClipData a;
        public final int b;
        public int c;
        public Uri d;
        public Bundle e;

        public F1(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // d80.CQf
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // d80.CQf
        public final void b(int i) {
            this.c = i;
        }

        @Override // d80.CQf
        public final d80 build() {
            return new d80(new YKK(this));
        }

        @Override // d80.CQf
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    public static final class LPt8Fixed implements NUlFixed {
        public final ContentInfo a;

        public LPt8Fixed(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.a = contentInfo;
        }

        @Override // d80.NUlFixed
        public final int c() {
            return this.a.getFlags();
        }

        @Override // d80.NUlFixed
        public final int d() {
            return this.a.getSource();
        }

        @Override // d80.NUlFixed
        public final ClipData e() {
            return this.a.getClip();
        }

        @Override // d80.NUlFixed
        public final ContentInfo f() {
            return this.a;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    public interface NUlFixed {
        int c();

        int d();

        ClipData e();

        ContentInfo f();
    }

    public static final class QnHx implements CQf {
        public final ContentInfo$Builder a;

        public QnHx(ClipData clipData, int i) {
            this.a = new ContentInfo$Builder(clipData, i);
        }

        @Override // d80.CQf
        public final void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // d80.CQf
        public final void b(int i) {
            this.a.setFlags(i);
        }

        @Override // d80.CQf
        public final d80 build() {
            return new d80(new LPt8Fixed(this.a.build()));
        }

        @Override // d80.CQf
        public final void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    public static final class YKK implements NUlFixed {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public YKK(F1 f1) {
            ClipData clipData = f1.a;
            clipData.getClass();
            this.a = clipData;
            int i = f1.b;
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.b = i;
            int i2 = f1.c;
            if ((i2 & 1) == i2) {
                this.c = i2;
                this.d = f1.d;
                this.e = f1.e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // d80.NUlFixed
        public final int c() {
            return this.c;
        }

        @Override // d80.NUlFixed
        public final int d() {
            return this.b;
        }

        @Override // d80.NUlFixed
        public final ClipData e() {
            return this.a;
        }

        @Override // d80.NUlFixed
        public final ContentInfo f() {
            return null;
        }

        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            int i = this.b;
            if (i == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i != 4) {
                strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb.append(strValueOf);
            sb.append(", flags=");
            int i2 = this.c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return i5.b(sb, this.e != null ? ", hasExtras" : "", "}");
        }
    }

    public d80(NUlFixed nUl) {
        this.a = nUl;
    }

    public final String toString() {
        return this.a.toString();
    }
}
