package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
public class AdCompanionView extends AdComponentFrameLayout {
    public AdCompanionViewApi w;

    public AdCompanionView(Context context) {
        super(context);
        initializeSelf(context);
    }

    public AdCompanionViewApi getAdCompanionViewApi() {
        return this.w;
    }

    public final void initializeSelf(Context context) {
        AdCompanionViewApi adCompanionViewApiCreateAdCompanionViewApi = DynamicLoaderFactory.makeLoader(context).createAdCompanionViewApi();
        this.w = adCompanionViewApiCreateAdCompanionViewApi;
        attachAdComponentViewApi(adCompanionViewApiCreateAdCompanionViewApi);
        this.w.initialize(this);
    }

    public AdCompanionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public AdCompanionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(context);
    }
}
