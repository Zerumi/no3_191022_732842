package places.superPlaces.isolatedPlaces;

import story.IActionable;

public class Theatre extends IsolatedPlace implements IActionable {

    public Theatre(String name) {
        super(name);
    }

    @Override
    public String getDescribe() {
        return getName();
    }
}
