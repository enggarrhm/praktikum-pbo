package com.enggar.unguided;

import java.util.Comparator;

public class WaktuComparator implements Comparator<ModelResult> {

    // Urut berdasarkan waktu training tercepat ke terlama (ascending)
    @Override
    public int compare(ModelResult a, ModelResult b) {
        return Integer.compare(a.getWaktuTraining(), b.getWaktuTraining());
    }
}