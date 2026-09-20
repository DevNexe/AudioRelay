package com.revenuecat.purchases.common;

import com.revenuecat.purchases.strings.Emojis;
import defpackage.ps0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public enum LogIntent {
    DEBUG(Collections.singletonList(Emojis.INFO)),
    GOOGLE_ERROR(ps0.M(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    GOOGLE_WARNING(ps0.M(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    INFO(Collections.singletonList(Emojis.INFO)),
    PURCHASE(Collections.singletonList(Emojis.MONEY_BAG)),
    RC_ERROR(ps0.M(Emojis.SAD_CAT_EYES, Emojis.DOUBLE_EXCLAMATION)),
    RC_PURCHASE_SUCCESS(ps0.M(Emojis.HEART_CAT_EYES, Emojis.MONEY_BAG)),
    RC_SUCCESS(Collections.singletonList(Emojis.HEART_CAT_EYES)),
    USER(Collections.singletonList(Emojis.PERSON)),
    WARNING(Collections.singletonList(Emojis.WARNING)),
    AMAZON_WARNING(ps0.M(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    AMAZON_ERROR(ps0.M(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION));

    private final List<String> emojiList;

    LogIntent(List list) {
        this.emojiList = list;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }
}
