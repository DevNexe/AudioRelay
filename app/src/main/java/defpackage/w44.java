package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class w44 extends ta2 {
    public final QnHx A;
    public final CQf B;
    public final F1 C;
    public final s44 y;
    public final ScarRewardedAdHandler z;

    public class CQf implements OnUserEarnedRewardListener {
        public CQf() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public final void onUserEarnedReward(RewardItem rewardItem) {
            w44.this.z.onUserEarnedReward();
        }
    }

    public class F1 extends FullScreenContentCallback {
        public F1() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            w44.this.z.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            w44.this.z.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            w44.this.z.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            w44.this.z.onAdOpened();
        }
    }

    public class QnHx extends RewardedAdLoadCallback {
        public QnHx() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            w44.this.z.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, com.google.android.gms.ads.rewarded.RewardedAd, java.lang.Object] */
        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(RewardedAd rewardedAd) {
            RewardedAd rewardedAd2 = rewardedAd;
            super.onAdLoaded(rewardedAd2);
            w44 w44Var = w44.this;
            w44Var.z.onAdLoaded();
            rewardedAd2.setFullScreenContentCallback(w44Var.C);
            w44Var.y.a = rewardedAd2;
            kh1 kh1Var = (kh1) w44Var.x;
            if (kh1Var != null) {
                kh1Var.onAdLoaded();
            }
        }
    }

    public w44(ScarRewardedAdHandler scarRewardedAdHandler, s44 s44Var) {
        super(19);
        this.A = new QnHx();
        this.B = new CQf();
        this.C = new F1();
        this.z = scarRewardedAdHandler;
        this.y = s44Var;
    }
}
