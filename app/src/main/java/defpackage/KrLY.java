package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.azefsw.audioconnect.ads.ui.banner.CQf;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes.dex */
public final class KrLY extends FrameLayout {
    public AdView w;
    public final c2 x;

    public final class QnHx extends AdListener {
        public final h81<sd5> w;
        public final h81<sd5> x;

        /* JADX INFO: renamed from: KrLY$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0004QnHx extends cx1 implements h81<sd5> {
            public final /* synthetic */ LoadAdError w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0004QnHx(LoadAdError loadAdError) {
                super(0);
                this.w = loadAdError;
            }

            @Override // defpackage.h81
            public final sd5 invoke() {
                a62.a.f("banner_failed_to_load", new Sr6(this.w));
                return sd5.a;
            }
        }

        public QnHx(com.azefsw.audioconnect.ads.ui.banner.QnHx qnHx, CQf cQf) {
            this.w = qnHx;
            this.x = cQf;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            a62 a62Var = a62.a;
            a62.a.g("clicked_on_banner", null);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            a62 a62Var = a62.a;
            KrLY.this.x.a(new C0004QnHx(loadAdError));
            this.x.invoke();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            a62 a62Var = a62.a;
            this.w.invoke();
        }
    }

    public KrLY(Context context) {
        super(context, null, 0);
        gq0.QnHx qnHx = gq0.x;
        this.x = new c2(ps0.o0(30, kq0.MINUTES));
    }
}
