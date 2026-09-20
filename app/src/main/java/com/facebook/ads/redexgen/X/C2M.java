package com.facebook.ads.redexgen.X;

import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2M extends F9 {
    public C2M(C1075Xy c1075Xy) {
        super(c1075Xy);
        setCarouselLayoutManager(c1075Xy);
    }

    @Nullable
    public S9 getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof S9) {
            return (S9) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public C1263cB getLayoutManager() {
        return (C1263cB) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(C1075Xy c1075Xy) {
        C1263cB c1263cB = new C1263cB(c1075Xy, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1263cB.A1V(true);
        }
        super.setLayoutManager(c1263cB);
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public void setLayoutManager(C4T c4t) {
    }
}
